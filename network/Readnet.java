// �w�肳�ꂽPC�ɃA�N�Z�X���A���b�Z�[�W���󂯎���ĕW���o�͂ɏo�͂���B
// �������@�F java  Readnet �@PC��  �|�[�g�ԍ�
// Readnet.java

import java.io.*;
import java.net.*;

public class Readnet
{
	public static void main(String[] args)
	{
		byte[]	buff	=	new	byte[1024];
		Socket	readsock	=	null;														// �\�P�b�gobj�B���͗p�B
		InputStream	instr	=	null;														// ���̓f�[�^�X�g���[���B
		boolean	cont	=	true;

		try	{
			// �w��̃|�[�g�ɐڑ�����B
			readsock	=	new	Socket(args[0],	Integer.parseInt(args[1]));	
			// �\�P�b�gobj����A���̓f�[�^�X�g���[���𐶐�����B
			instr	=	readsock.getInputStream();											
		}												catch	(Exception	e)	{
			System.err.println("�l�b�g���[�N�G���[�ł��B");
			System.exit(1);
		}


		// �f�[�^�I���܂ŏ������J��Ԃ��B
		while(cont)
		{
			try	{
				// ���̓f�[�^�X�g���[������ǂݍ��ށB
				int	n	=	instr.read(buff);			

				// buff �̓��e��W���o�͂ɏo�́B
				System.out.write(buff,	0,	n);							}																							// ���t�@�C���̏����Ɠ����I�I
			catch	(Exception	e)	{
				cont	=	false;
			}
		}


		try	{
			instr.close();											// �ڑ������B
		}																								// ��������A�t�@�C���Ɠ����I�I
		catch	(Exception	e)	{
			System.err.println("�l�b�g���[�N�̃G���[�ł��B");
			System.exit(1);
		}

	}
}
