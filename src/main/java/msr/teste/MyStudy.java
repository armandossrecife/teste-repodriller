package msr.teste;

import org.repodriller.RepoDriller;
import org.repodriller.RepositoryMining;
import org.repodriller.Study;
import org.repodriller.filter.range.Commits;
import org.repodriller.persistence.csv.CSVFile;
import org.repodriller.scm.GitRepository;

/**
 * MyStudy
 * Executa a mineração de dados no repositório selecionado
 * @author armandosoaressousa
 *
 */
public class MyStudy implements Study {
	
	public static void main(String[] args) {
		new RepoDriller().start(new MyStudy());
	}

	@Override
	public void execute() {
		new RepositoryMining()
		.in(GitRepository.singleProject(Constantes.repositorioSagres))
		.through(Commits.all())
		.process(new DevelopersVisitor(), new CSVFile(Constantes.diretorioArmazenamento+"dev-sagres-web.csv"))
		.mine();
	}
}