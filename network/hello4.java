// �L�[�{�[�h�i�W�����́j����ǂ݂���ŁA��ʁi�W���o�́j�ɕ\���i�o�͂���j�B
// ���N���X�ɂ����ځI�I
// hello4.java

import	java.io.*;

public	class	hello4
{
	public	static	void	main(String[]	args)
	{
		ReadWrite	rw	=	new	ReadWrite();					// ReadWrite�N���X�̃C���X�^���X���Arw �Ƃ������O��
																			// �V�K�쐬����B
		rw.yomikaki();													// rw �̋@�\�ł���Ayomikaki()���\�b�h���Ăяo��
	}																		// �i���s������j�B
}




class	ReadWrite
{
	public	static	void	yomikaki()
	{
		byte[]	buff	=	new	byte[1024];
		int	n;

		try	{
			n	=	System.in.read(buff);								// �W�����͂���ǂݍ��񂾃f�[�^�� buff �Ɋi�[���A
																				// �o�C�g����Ԃ��B
			System.out.write(buff,  0,  n);							// buff ���� n�o�C�g�̃f�[�^��W���o�͂ɏo�͂���B
		} catch (IOException e) {
			System.err.println("�G���[���������܂����I");
			System.exit(1);
		}
	}
}