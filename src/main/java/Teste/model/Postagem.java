package Teste.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

	// javax.persistence
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	
	@Size(min = 1, max = 500, message = "o titulo deve conter entre 1 e 500 caracteres")
	private String titulo;

	
	@Size(min = 1, max = 2000, message = "o nome deve conter entre 1 e 2000 caracteres")
	private String descricao;

	private String anexo;

	@UpdateTimestamp
	private LocalDateTime data;
	
	@Size(min = 1, max = 500, message = "a area deve conter entre 1 e 500 caracteres")
	private String area;
	
	private String razaoSocial;

	private String cnpj;
	
	private String natureza;
	
	private String endereco;
	
	private String site;
	
	private String telefone;
	
	private String email;
	
	private String dataFundacao;
	
	private String presidente;
	
	private String missao;
	
	private String prioritarias;
	
	private String publicoAlvo;
	
	private String clt;
	
	private String voluntarios;
	
	private String terceirizados;
	
	private String conselhoCient;
	
	private String quest1;
	
	private String quest2;
	
	private String quest3;
	
	private String quest4;
	
	private String quest5;


	

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;




	public Postagem(long id,
			@Size(min = 1, max = 500, message = "o titulo deve conter entre 1 e 500 caracteres") String titulo,
			@Size(min = 1, max = 2000, message = "o nome deve conter entre 1 e 2000 caracteres") String descricao,
			String anexo, LocalDateTime data,
			@Size(min = 1, max = 500, message = "a area deve conter entre 1 e 500 caracteres") String area,
			String razaoSocial, String cnpj, String natureza, String endereco, String site, String telefone,
			String email, String dataFundacao, String presidente, String missao, String prioritarias,
			String publicoAlvo, String clt, String voluntarios, String terceirizados, String conselhoCient,
			String quest1, String quest2, String quest3, String quest4, String quest5, Usuario usuario) {
		
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.anexo = anexo;
		this.data = data;
		this.area = area;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.natureza = natureza;
		this.endereco = endereco;
		this.site = site;
		this.telefone = telefone;
		this.email = email;
		this.dataFundacao = dataFundacao;
		this.presidente = presidente;
		this.missao = missao;
		this.prioritarias = prioritarias;
		this.publicoAlvo = publicoAlvo;
		this.clt = clt;
		this.voluntarios = voluntarios;
		this.terceirizados = terceirizados;
		this.conselhoCient = conselhoCient;
		this.quest1 = quest1;
		this.quest2 = quest2;
		this.quest3 = quest3;
		this.quest4 = quest4;
		this.quest5 = quest5;
		this.usuario = usuario;
	}
	
	public Postagem() {  }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getPresidente() {
		return presidente;
	}

	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}

	public String getMissao() {
		return missao;
	}

	public void setMissao(String missao) {
		this.missao = missao;
	}

	public String getPrioritarias() {
		return prioritarias;
	}

	public void setPrioritarias(String prioritarias) {
		this.prioritarias = prioritarias;
	}

	public String getPublicoAlvo() {
		return publicoAlvo;
	}

	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}

	public String getClt() {
		return clt;
	}

	public void setClt(String clt) {
		this.clt = clt;
	}

	public String getVoluntarios() {
		return voluntarios;
	}

	public void setVoluntarios(String voluntarios) {
		this.voluntarios = voluntarios;
	}

	public String getTerceirizados() {
		return terceirizados;
	}

	public void setTerceirizados(String terceirizados) {
		this.terceirizados = terceirizados;
	}

	public String getConselhoCient() {
		return conselhoCient;
	}

	public void setConselhoCient(String conselhoCient) {
		this.conselhoCient = conselhoCient;
	}

	public String getQuest1() {
		return quest1;
	}

	public void setQuest1(String quest1) {
		this.quest1 = quest1;
	}

	public String getQuest2() {
		return quest2;
	}

	public void setQuest2(String quest2) {
		this.quest2 = quest2;
	}

	public String getQuest3() {
		return quest3;
	}

	public void setQuest3(String quest3) {
		this.quest3 = quest3;
	}

	public String getQuest4() {
		return quest4;
	}

	public void setQuest4(String quest4) {
		this.quest4 = quest4;
	}

	public String getQuest5() {
		return quest5;
	}

	public void setQuest5(String quest5) {
		this.quest5 = quest5;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	

	
	
	

}
