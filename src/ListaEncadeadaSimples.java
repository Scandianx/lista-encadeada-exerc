
public class ListaEncadeadaSimples implements ListaEncadeada {

	No noInicial = null;
	int totalDeElementos = 0;

	@Override
	public void adicionarInicio(int dado) {
		No novoNo = new No(dado);
		novoNo.definirProximo(this.noInicial);
		this.noInicial = novoNo;
		this.totalDeElementos++;
	}

	@Override
	public void adicionarFim(int dado) {
		No novoNo = new No(dado);
		No noAtual = this.noInicial;
		if (this.noInicial != null) {
			while (noAtual.obterProximo() != null) {
				noAtual = noAtual.obterProximo();
			}
			noAtual.definirProximo(novoNo);
		} else {
			this.noInicial = novoNo;
		}
		this.totalDeElementos++;
	}

	@Override
	public boolean adicionarMeio(int posicaoInclusao, int dado) {
		No novoNo = new No(dado);
		No noAtual = this.noInicial;
		No noAnterior = null;
		int posicaoAtual = 0;

		while ((noAtual != null) && (posicaoInclusao != posicaoAtual)) {
			noAnterior = noAtual;
			noAtual = noAtual.obterProximo();
			posicaoAtual++;
		}

		if (posicaoInclusao == posicaoAtual) {
			if (noAnterior == null) {
				novoNo.definirProximo(this.noInicial);
				this.noInicial = novoNo;
			} else {
				noAnterior.definirProximo(novoNo);
				novoNo.definirProximo(noAtual);
			}
			this.totalDeElementos++;
			return true;
		}
		return false;
	}

	@Override
	public boolean excluirInicio() {
		if (this.noInicial != null) {
			this.noInicial = this.noInicial.obterProximo();
			this.totalDeElementos--;
			return true;
		}
		return false;
	}

	@Override
	public boolean excluirFim() {
		No noAtual = this.noInicial;
		No noAnterior = null;

		if (this.noInicial != null) {
			while (noAtual.obterProximo() != null) {
				noAnterior = noAtual;
				noAtual = noAtual.obterProximo();
			}
			if (noAnterior != null) {
				noAnterior.definirProximo(null);
			} else {
				this.noInicial = null;
			}
			this.totalDeElementos--;
			return true;
		}
		return false;
	}

	public boolean excluirDadoEspecifico(int dado) {
		if (this.noInicial == null) {
			return false;
		}
		No noAtual = this.noInicial;
		No anterior = null;
		if (this.noInicial.obterDado() == dado && this.noInicial.obterProximo() != null) {
			this.noInicial = this.noInicial.obterProximo();
		} else {
			if ((this.noInicial.obterDado() == dado && this.noInicial.obterProximo() == null)) {
				this.noInicial = null;
			}
		}

		while (noAtual.obterProximo() != null) {
			noAtual = noAtual.obterProximo();
			if (noAtual.obterDado() == dado) {
				anterior.definirProximo(noAtual.obterProximo());
				this.totalDeElementos--;
				return true;
			}
			anterior = noAtual;

		}
		return false;
	}

	public boolean incluirEmOrdemCrescente(int dado) {
		No noNovo = new No(dado);
		No noInicial = this.noInicial;
		No noAnterior = null;
		if (this.noInicial.obterProximo() == null) {
			if (this.noInicial.obterDado() < dado) {

				this.noInicial.definirProximo(noNovo);
				this.totalDeElementos++;
				return true;

			} else {
				noAnterior = this.noInicial;
				this.noInicial = noNovo;
				this.noInicial.definirProximo(noAnterior);
			}
		}
		if (this.noInicial != null) {
			while (noInicial.obterProximo() != null) {
				if (noInicial.obterDado() <= dado && noInicial.obterProximo().obterDado() > dado) {
					noAnterior.definirProximo(noNovo);
					noNovo.definirProximo(noInicial);
					this.totalDeElementos++;
					return true;
				}
				noAnterior = noInicial;
				noInicial = noInicial.obterProximo();
				if (noInicial.obterProximo() == null) {
					if (noInicial.obterDado() <= dado) {
						noInicial.definirProximo(noNovo);
						this.totalDeElementos++;
						return true;
					}
				}

			}
			adicionarInicio(dado);
			return false;
		} else {
			return false;
		}
	}

	@Override
	public boolean excluirMeio(int posicaoExclusao) {
		No noAtual = this.noInicial;
		No noAnterior = null;
		int posicaoAtual = 0;

		if (this.noInicial != null) {
			while ((noAtual.obterProximo() != null) && (posicaoExclusao != posicaoAtual)) {
				noAnterior = noAtual;
				noAtual = noAtual.obterProximo();
				posicaoAtual++;
			}
			if (posicaoExclusao == posicaoAtual) {
				if (noAnterior == null) {
					this.noInicial = noAtual.obterProximo();
				} else {
					noAnterior.definirProximo(noAtual.obterProximo());
				}
				this.totalDeElementos--;
				return true;
			}
		}
		return false;
	}

	@Override
	public int obterDado(int posicaoBuscada) {
		int posicaoAtual = 0;
		No noAtual = this.noInicial;
		while ((noAtual != null) && (posicaoAtual != posicaoBuscada)) {
			noAtual = noAtual.obterProximo();
			posicaoAtual++;
		}
		if (posicaoAtual == posicaoBuscada) {
			return noAtual.obterDado();
		}
		return -1;
	}

	@Override
	public int obterTotalDeElementos() {
		return this.totalDeElementos;
	}

	@Override
	public String toString() {
		String elementos = new String();
		No noAtual = this.noInicial;
		while (noAtual != null) {
			elementos = elementos + noAtual.obterDado() + " ";
			noAtual = noAtual.obterProximo();
		}
		return "ListaEncadeada [ " + elementos + "]";
	}

	public int pesquisaBinaria(int dado) {
		int inicio = 0;
		int fim = this.totalDeElementos - 1;
	
		while (inicio <= fim) {
			int meio = (inicio + fim) / 2;
			int valorMeio = obterDado(meio); 
	
			if (valorMeio == dado) {
				return meio; 
			} else if (valorMeio < dado) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}
	
		return -1; 
	}
	public void bubbleSort() {
		if (this.noInicial == null || this.noInicial.obterProximo() == null) {
			return; 
		}
	
		boolean trocou;
		do {
			trocou = false;
			No noAtual = this.noInicial;
			No noAnterior = null;
	
			while (noAtual != null && noAtual.obterProximo() != null) {
				No noProximo = noAtual.obterProximo();
				if (noAtual.obterDado() > noProximo.obterDado()) {
					
					if (noAnterior == null) {
						this.noInicial = noProximo;
					} else {
						noAnterior.definirProximo(noProximo);
					}
	
					noAtual.definirProximo(noProximo.obterProximo());
					noProximo.definirProximo(noAtual);
	
					trocou = true;
				}
	
				noAnterior = noAtual;
				noAtual = noAtual.obterProximo();
			}
		} while (trocou);
	}

	@Override
	public Iterador obterIterador() {
		Iterador iterador = new IteradorListaEncadeada(this.noInicial);
		return iterador;
	}

}