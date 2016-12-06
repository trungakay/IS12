// �|�[�g6000�ŃA�N�Z�X��҂��A������Ԃ��T�[�o�B
// ��ServerSocket�o��B
// ��for���ɂ��u�J��Ԃ������v�o��B
// ��Date�I�u�W�F�N�g�o��B
// ClockServer.java

import	java.io.*;
import	java.net.*;
import	java.util.*;

public	class	ClockServer
{
	public static void	main(String[]	args)
	{
		// �錾�B
		ServerSocket	servsock	=	null;	// �T�[�o�p�\�P�b�g�B
		Socket	sock;								// �ǂݏ����p�\�P�b�g�B
		OutputStream	out;					// �o�̓X�g���[���B
		String	outstr;
		int	i;
		Date	d;										// ���t���n���h������I�u�W�F�N�g�B

		// �T�[�o����B
		try	{
			// �T�[�o�\�P�b�g���쐬����B
			servsock	=	new	ServerSocket(6000,	300);

			// �ڑ��̑҂��󂯂Ə����̌J��Ԃ��B
			while(true)
			{
				sock	=	servsock.accept();				// �ڑ���t�B

				// �o�͗p�f�[�^�𐶐�����B
				d	=	new	Date();
				outstr	=	"\n"
								+	"Hello, this is ClockServer by XXXXXXX."
								+	"\n"	+	d.toString()	+	"\n"
								+	"Thank you."	+	"\n";

				// �f�[�^���o�͂���B
				out	=	sock.getOutputStream();
				for(i=0;	i<outstr.length();	i++)
				{
					out.write((int)	outstr.charAt(i));
				}
				out.write('\n');

				// �ڑ��I���B
				sock.close();
			}
		}
		catch	(IOException	e)	{
			System.exit(1);
		}
	}
}
