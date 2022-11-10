

public abstract class Celular {
  private boolean ligado;
  private boolean câmera;
  private boolean foneDeOuvido;
  private boolean controleVolume;
  private boolean enviaMensagem;
  private boolean acessaInternet;
  private boolean enviaEmail;
  private boolean radio;
  private boolean tv;
  private boolean verificadorDeArquivos;
  private double valor;

  public Celular(double valor) {
    this.ligado = true;
    this.câmera = true;
    this.foneDeOuvido = true;
    this.controleVolume = true;
    this.enviaMensagem = true;
    this.acessaInternet = true;
    this.enviaEmail = true;
    this.radio = true;
    this.tv = true;
    this.verificadorDeArquivos = true;
    this.valor = valor;
  }

  public boolean isLigado() {
    return ligado;
  }

  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public boolean isCâmera() {
    return câmera;
  }

  public void setCâmera(boolean câmera) {
    this.câmera = câmera;
  }

  public boolean isFoneDeOuvido() {
    return foneDeOuvido;
  }

  public void setFoneDeOuvido(boolean foneDeOuvido) {
    this.foneDeOuvido = foneDeOuvido;
  }

  public boolean isEnviaMensagem() {
    return enviaMensagem;
  }

  public void setEnviaMensagem(boolean enviaMensagem) {
    this.enviaMensagem = enviaMensagem;
  }

  public boolean isAcessaInternet() {
    return acessaInternet;
  }

  public void setAcessaInternet(boolean acessaInternet) {
    this.acessaInternet = acessaInternet;
  }

  public boolean isEnviaEmail() {
    return enviaEmail;
  }

  public void setEnviaEmail(boolean enviaEmail) {
    this.enviaEmail = enviaEmail;
  }

  public boolean isRadio() {
    return radio;
  }

  public void setRadio(boolean radio) {
    this.radio = radio;
  }

  public boolean isTv() {
    return tv;
  }

  public void setTv(boolean tv) {
    this.tv = tv;
  }

  public boolean isVerificadorDeArquivos() {
    return verificadorDeArquivos;
  }

  public void setVerificadorDeArquivos(boolean verificadorDeArquivos) {
    this.verificadorDeArquivos = verificadorDeArquivos;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public boolean isControleVolume() {
    return controleVolume;
  }

  public void setControleVolume(boolean controleVolume) {
    this.controleVolume = controleVolume;
  }

  public String detalhes() {
    String detalhes = "Funcionalidades\n";
    if (isCâmera()) {
      detalhes += "\nCamera";
    }
    if (isFoneDeOuvido()) {
      detalhes += "\nFone de Ouvido";
    }
    if (isControleVolume()) {
      detalhes += "\nControle de Volume";
    }
    if (isEnviaMensagem()) {
      detalhes += "\nEnvia Mensagem";
    }
    if (isAcessaInternet()) {
      detalhes += "\nAcesso a Internet";
    }
    if (isEnviaEmail()) {
      detalhes += "\nEnvio de e-mails";
    }
    if (isRadio()) {
      detalhes += "\nRadio";
    }
    if (isTv()) {
      detalhes += "\nTV";
    }
    if (isVerificadorDeArquivos()) {
      detalhes += "\nVerificador de Arquivos do Sistema";
    }
    return detalhes;
  }
}
