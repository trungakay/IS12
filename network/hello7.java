// �W�����͂���ǂ݂���ŁA�t�@�C���ɏo�͂���B
// �N���X�𕪂���قǂ̓��e�ł͂Ȃ��̂ŁAhello7�N���X�� main���\�b�h �̒��őS�Ă����s����B
// �������@�F  java  hello7  �o�̓t�@�C����
// hello7.java

import	java.io.*;

public	class	hello7
{
	public	static	void	main(String[]	args)
	{
		byte[]	buff	=	new	byte[1024];
		boolean	cont	=	true;
		FileOutputStream	outfile	=	null;

		// �o�͗p�̃t�@�C���𐶐�����B
		try	{
			outfile	=	new	FileOutputStream(args[0]);
		} catch (FileNotFoundException	e) {
			System.err.println("�t�@�C�����݂���܂���B");
			System.exit(1);
		}

		// �������[�v
		while (cont)
		{
			try	{
				int	n	=	System.in.read(buff);
				System.out.write(buff,  0,  n);

				// �����A���͍s�̏��߂��u�D�v�������烋�[�v�I��
				if (buff[0]	==	'.')
				{
					cont	=	false;
				}
				else
				{
					outfile.write(buff,  0,  n);
				}
			} catch (Exception  e) {
				System.exit(1);
			}
		} // while �̏I���B


		// �o�͗p�t�@�C�������B
		try	{
			outfile.close();
		} catch (IOException  e) {
			System.err.println("�t�@�C���G���[");
			System.exit(1);
		}
	} // main���\�b�h�̏I���B
} // hello7�N���X�̏I���B

