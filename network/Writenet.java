

import java.io.*;
import java.net.*;

public class Writenet
{
	public static void main(String[] args)
	{
		byte[] buff = new byte[1024];
		Socket	sock	=	null;
		InputStream	instr	=	null;
		OutputStream	outstr	=	null;
		boolean	cont	=	true;

		// �T�[�o�ւ̐ڑ�
		try	{
			int	portNum	=	Integer.parseInt(args[1]);					// �����͕����Ȃ̂ŁA�|�[�g�ԍ�����
			sock	=	new Socket(args[0], portNum);							// ���l�ɕϊ�����B
			instr	=	sock.getInputStream();
			outstr	=	sock.getOutputStream();
		}	catch	(Exception	e)	{
			System.err.println("�l�b�g���[�N�G���[");
			System.exit(1);
		}

		// ���͂𑗐M����B
		while	(cont)
		{
			try	{
				int	n	=	System.in.read(buff);
				if	(buff[0]	== '.')
				{
					cont	=	false;
				}
				else
				{
					outstr.write(buff, 0, n);
				}
			} catch( Exception	e)	{
				System.exit(1);
			}
		}


		// �T�[�o����̕ԐM���o�͂���B
		cont	=	true;
		while	(cont)
		{
			try	{
				int	n	=	instr.read(buff);
				System.out.write(buff, 0, n);
			}	catch	(Exception	e)	{
				cont	=	false;
			}
		}


		// �ڑ������B
		try	{
			instr.close();
		}	catch	(Exception	e){
			System.err.println("�l�b�g���[�N�G���[");
			System.exit(1);
		}

	} // main()���\�b�h�̏I���B
} // Writenet�N���X�̏I���B
