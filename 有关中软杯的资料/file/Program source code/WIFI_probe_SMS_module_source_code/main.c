/**********************************************************************************
 //SIMXXXϵ�п�����ײ����
 //ȫ��ӥ����@UNV
 //�汾��;V1.0
 //�ٷ��Ա����ַ��https://shop110330041.taobao.com
 //��Ȩ���У�����ؾ�
* ������  :���ſ���LED��
 * ����    :ͨ����GSM�巢�Ϳ���������ţ������Ƶ�Ƭ�����ϵ�LED�ƣ���������Ϊ��on ����off�� 
 * ʵ��ƽ̨:STC89XX
 * ��汾  :

**********************************************************************************/

#include "string.h"
#include "delay.h"
#include "uart.h"
#include "timer0.h"
#include "SIMxxx.h"

sbit P10=P0^0;	//������ʾ������е�����
sbit P11=P0^1;	//������ʾ������е�����
sbit RUNING_LED=P0^2;	//�����п��Ƶ�LED��
/*************  �ⲿ�����ͱ�������*****************/
/*******************************************************************************
* ������ : main 
* ����   : ������
* ����   : 
* ���   : 
* ����   : 
* ע��   : 
*******************************************************************************/
void main(void)
{
	u8 res;
	Uart1Init();
	Timer0Init();
	EA=1;	//�����ж�
	res=1;
	P10=0;
	RUNING_LED=0;

	while(res)
	{
		res=sim900a_work_test();
	}
	res=1;
	while(res)
	{
		res=sim900a_enmessage_mode_out();
	} 
	P10=1;
	res=1;
	while(1)
	{
		if(Flag_Rec_Message==1)	
		{
			Flag_Rec_Message=0;
			res=SIM_HANDLE_MESSAGE_CMD();
		   if(res)
			{
				if(res==1)		RUNING_LED=0;
				else if(res==2)		RUNING_LED=1;
			} 
		}		
	}	
}




