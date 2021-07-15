package com.sharyu.springbatchbasics.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.sharyu.springbatchbasics.model.Delivery;
import com.sharyu.springbatchbasics.model.Match;

public class DeliveryDataProcessor implements ItemProcessor<DeliveryInput, Delivery> {

	private static final Logger log = LoggerFactory.getLogger(DeliveryDataProcessor.class);

	@Override
	public Delivery process(final DeliveryInput deliveryInput) throws Exception {
		Delivery delivery = new Delivery();
		delivery.setMatchId(Long.parseLong(deliveryInput.getMatch_id()));
		delivery.setBall(deliveryInput.getBall());
		delivery.setBatsman(deliveryInput.getBatsman());
		delivery.setBattingTeam(deliveryInput.getBatting_team());
		delivery.setBowler(deliveryInput.getBowler());
		delivery.setBowlingTeam(delivery.getBowlingTeam());
		delivery.setByeRuns(deliveryInput.getBye_runs());
		delivery.setDismissalKind(deliveryInput.getDismissal_kind());
		delivery.setExtraRuns(deliveryInput.getExtra_runs());
		delivery.setFielder(deliveryInput.getFielder());
		delivery.setInning(deliveryInput.getFielder());
		delivery.setIsSuperOver(deliveryInput.getIs_super_over());
		delivery.setLegbyeRuns(deliveryInput.getLegbye_runs());
		delivery.setNoballRuns(deliveryInput.getNoball_runs());
		delivery.setNonStriker(deliveryInput.getNon_striker());
		delivery.setOver(deliveryInput.getOver());
		delivery.setPenaltyRuns(deliveryInput.getPenalty_runs());
		delivery.setPlayerDismissed(deliveryInput.getPlayer_dismissed());
		delivery.setTotalRuns(deliveryInput.getTotal_runs());
		delivery.setWideRuns(deliveryInput.getWide_runs());
		delivery.setTotalRuns(deliveryInput.getTotal_runs());


		log.info("Converting (" + delivery + ") into (" + delivery + ")");
		return delivery;

	}

}
