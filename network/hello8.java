// �t�@�C������ǂݍ��݁A�W���o�͂ɏo�͂���B
// �������@�F java  hello8  ���̓t�@�C����

import	java.io.*;

public	class	hello8
{
	public	static	void	main(String[]	args)
	{
		byte[]	buff	=	new	byte[1024];
		boolean	cont	=	true;
		FileInputStream	infile	=	null;

		// ���͗p�t�@�C�����J���i���t�@�C�����n���h������I�u�W�F�N�g�𐶐�����j�B
		try	{
			infile	=	new	FileInputStream(args[0]);
		} catch (FileNotFoundException	e) {
			System.err.println("�t�@�C��������܂���B");
			System.exit(1);
		}


		// �������[�v�Ńt�@�C���̓��e���P�s���o�͂���B
		while (cont)
		{
			try	{
				int	n	=	infile.read(buff);
				System.out.write(buff,  0,  n);
			} catch (Exception	e) {
				cont	=	false;										// �t�@�C���̏I���ɂȂ�ƁA�ǂݍ��݂Ɏ��s���邽��
			}															// �G���[�ƂȂ�B����𗘗p���ēǂݍ��݂��I������B
		}


		// ���̓t�@�C�������B
		try	{
			infile.close();
		} catch (IOException	e) {
			System.err.println("�t�@�C���G���[");
			System.exit(1);
		}
	} // main���\�b�h�̏I���B
} // hello8�N���X�̏I���B
