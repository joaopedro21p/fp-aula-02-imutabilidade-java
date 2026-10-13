
public class Principal {
    public static void main(final String[] args) {

        // Testando CidadeRecord (imutável)
        CidadeRecord cidadeRecord = new CidadeRecord("Palmas");
        System.out.println("CidadeRecord: " + cidadeRecord.nome());

        // Testando Cidade (mutável)
        Cidade cidade = new Cidade("Palmas");
        cidade.setNome("Araguaina");
        System.out.println("Cidade: " + cidade.getNome());

        // Testando PessoaRecordShallow (imutabilidade superficial)
        Cidade cidadeShallow = new Cidade("Gurupi");
        PessoaRecordShallow pessoaShallow =
                new PessoaRecordShallow("Joao", cidadeShallow);

        pessoaShallow.cidade().setNome("Tocantinopolis");
        System.out.println("PessoaRecordShallow: "
                + pessoaShallow.nome() + " - "
                + pessoaShallow.cidade().getNome());

        // Testando PessoaRecord (imutabilidade profunda)
        CidadeRecord cidadeImutavel = new CidadeRecord("Palmas");
        PessoaRecord pessoa = new PessoaRecord("Joao", cidadeImutavel);

        System.out.println("PessoaRecord: "
                + pessoa.nome() + " - "
                + pessoa.cidade().nome());
    }
}
