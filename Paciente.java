import java.time.LocalDate;
public class Paciente {

        String nome;
        String endereco;
        int cpf;
        char sexo;
        String nivelDeEscolaridade;
        String email;
        LocalDate dataDeNascimento;
        String telefone;


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;

        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public int getCpf() {
            return cpf;
        }

        public void setCpf(int cpf) {
            this.cpf = cpf;
        }

        public char getSexo() {
            return sexo;
        }

        public void setSexo(char sexo) {
            this.sexo = sexo;
        }

        public String getNivelDeEscolaridade() {
            return nivelDeEscolaridade;
        }

        public void setNivelDeEscolaridade(String nivelDeEscolatridade) {
            this.nivelDeEscolaridade = nivelDeEscolaridade;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public LocalDate getDataDeNascimento() {
            return dataDeNascimento;
        }

        public void setDataDeNascimento(LocalDate dataDeNascimento) {
            this.dataDeNascimento = dataDeNascimento;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
    }


