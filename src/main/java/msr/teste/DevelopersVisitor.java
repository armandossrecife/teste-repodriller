package msr.teste;

import java.util.Calendar;
import org.repodriller.domain.Commit;
import org.repodriller.domain.Developer;
import org.repodriller.persistence.PersistenceMechanism;
import org.repodriller.scm.CommitVisitor;
import org.repodriller.scm.SCMRepository;

/**
 * DevelopersVisitor
 * recupera as informações registradas por cada developer
 * @author armandosoaressousa
 *
 */
public class DevelopersVisitor implements CommitVisitor {
	@Override
	public void process(SCMRepository repo, Commit commit, PersistenceMechanism writer) {
		Calendar dataCommit;
		String data;
		String hash;
		Developer developer;
		String name;
		String message;

		dataCommit = commit.getDate();
		data = dataCommit.getTime().toString();
		hash = commit.getHash();
		developer = commit.getCommitter();
		name = developer.getName();
		message = commit.getMsg();

		writer.write(hash,name,data,message);
	}
}
