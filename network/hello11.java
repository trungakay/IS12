// �J��Ԃ������̗��K�v���O���� ���̂Q�B
// ����������A�P��������������B
// hello11.java

import	java.io.*;

public	class	hello11
{
	public	static	void	main(String[]	args)
	{
		String	kotoba	=	"Hello, world!";

		System.out.println("kotoba �̍ŏ��̕����́A" + kotoba.charAt(0) + "�ł��B");
		System.out.println("kotoba �̕������́A" + kotoba.length() + "�ł��B");

		for(int  i = 0;	 i<kotoba.length();	 i++)									// i ���g���ČJ��Ԃ��𐔂���B��������
		{																						// �������J��Ԃ��B
			System.out.println(kotoba.charAt(i));									// ���̏������ł́A���͖�肪�A�A�A�I
		}
	}
}
