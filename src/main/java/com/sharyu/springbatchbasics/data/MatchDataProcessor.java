package com.sharyu.springbatchbasics.data;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.sharyu.springbatchbasics.model.Match;

public class MatchDataProcessor implements ItemProcessor<MatchInput, Match> {

	private static final Logger log = LoggerFactory.getLogger(MatchDataProcessor.class);

	@Override
	public Match process(final MatchInput matchInput) throws Exception {
		Match match = new Match();
		match.setId(Long.parseLong(matchInput.getId()));

		match.setCity(matchInput.getCity());
		match.setDate(LocalDate.parse(matchInput.getDate()));
		match.setPlayerOfMatch(matchInput.getPlayer_of_match());
		match.setResult(matchInput.getResult());
		match.setVenue(matchInput.getVenue());
		
		String firstInningsTeam, secondInningsTeam;
		if(matchInput.getToss_decision().equals("bat")) {
			firstInningsTeam = matchInput.getToss_winner();
			secondInningsTeam = matchInput.getToss_winner().equals(matchInput.getTeam1()) ? matchInput.getTeam2() : matchInput.getTeam1();
		}
		else {
			secondInningsTeam = matchInput.getToss_winner();
			firstInningsTeam = matchInput.getToss_winner().equals(matchInput.getTeam1()) ? matchInput.getTeam2() : matchInput.getTeam1();
		}
		match.setTeam1(firstInningsTeam);
		match.setTeam2(secondInningsTeam);
		match.setSeason(matchInput.getSeason());
		match.setTossWinner(matchInput.getToss_winner());
		match.setTossDecision(matchInput.getToss_decision());
		match.setWinByRuns(matchInput.getWin_by_runs());
		match.setWinByWickets(matchInput.getWin_by_wickets());
		match.setUmpire1(matchInput.getUmpire1());
		match.setUmpire2(matchInput.getUmpire2());
		match.setUmpire3(matchInput.getUmpire3());
		

		log.info("Converting (" + matchInput + ") into (" + match + ")");
		return match;

	}

}
