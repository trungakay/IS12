// �u�I�u�W�F�N�g�ƃN���X�v�̗��B������^�iString�^�j�̋@�\�@���̂Q�B
// hello3.java

import	java.io.*;

public	class	hello3
{
	public	static	void	main(String[]	args)
	{
		String kotoba;
		int	n;

		kotoba	=	"Hello, world!";
		System.out.println("Hello, world!");

		n = kotoba.length();
		System.out.println(kotoba + "�̒����́A" + n + "�����ł��B");


		// �����悤�ȁA�����ЂƂ̗�B����ȏ��������ł���B
		System.out.println("�͂�[��[��ǁI");

		n = "�͂�[��[��ǁI".length();
		System.out.println("�͂�[��[��ǁI�̒����́A" + n + "�����ł��B");
	}
}
