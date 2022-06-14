package validations;

import java.util.Scanner;

public class ValidaCpfCnpjTeste 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o CPF/CNPJ: ");
		
        String num1 = entrada.next();
		System.out.println(num1);

		if (num1.length() == 11)
		{
			if (ValidaCpfCnpj.isValidSsn(num1) == true)
			{
				System.out.println("D�gito verificador correto");
			} else
				System.out.println("D�gito verificador incorreto");
		}

		if (num1.length() == 14)
		{
				if (ValidaCpfCnpj.isValidTfn(num1) == true)
				{
					System.out.println("D�gito verificador correto");
				} else
					System.out.println("D�gito verificador incorreto");
			
		}
				
		entrada.close();
	}

}
