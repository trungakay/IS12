// �u�I�u�W�F�N�g�ƃN���X�v�̗��B������^�iString�^�j�̋@�\�@���̂P�B
// hello2.java

import	java.io.*;

public	class	hello2
{
	public	static	void	main(String[]	args)
	{
		String kotoba;											// ������N���X�iString�N���X�j�̃C���X�^���X���Akotoba�Ƃ���
																		// ���O�Ő�������B
		int	n;														// �����N���X�iint�N���X�j�̃C���X�^���X���An�Ƃ������O�Ő���
																		// ����B

		kotoba	=	"Hello, world!";							// kotoba�ɕ������������B
		System.out.println("Hello, world!");

		n = kotoba.length();										// kotoba�̋@�\�ulength()�v���Ăяo���āA�������
																		// ���ꎩ�g�̒������v�Z������B
		System.out.println(kotoba + "�̒����́A" + n + "�����ł��B");			// ������̘A���B
	}
}
