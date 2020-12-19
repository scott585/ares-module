package com.ares.uitl;

import java.util.ArrayList;
import java.util.List;

/**
 *  
 * @author daitao
 *
 */
public enum HuobiOkxeChannelEnum {
	jsteth("jsteth", "JST-ETH"), eosbtc("eosbtc", "EOS-BTC"), paybtc("paybtc", "PAY-BTC"),
	ardrbtc("ardrbtc", "ARDR-BTC"), swrveth("swrveth", "SWRV-ETH"), hcusdt("hcusdt", "HC-USDT"),
	wbtceth("wbtceth", "WBTC-ETH"), btgbtc("btgbtc", "BTG-BTC"), ontbtc("ontbtc", "ONT-BTC"),
	avaxusdt("avaxusdt", "AVAX-USDT"), bandbtc("bandbtc", "BAND-BTC"), lrceth("lrceth", "LRC-ETH"),
	ctxcusdt("ctxcusdt", "CTXC-USDT"), atombtc("atombtc", "ATOM-BTC"), aacusdt("aacusdt", "AAC-USDT"),
	dhtusdt("dhtusdt", "DHT-USDT"), utkusdt("utkusdt", "UTK-USDT"), kncbtc("kncbtc", "KNC-BTC"),
	adausdt("adausdt", "ADA-USDT"), trioeth("trioeth", "TRIO-ETH"), icxbtc("icxbtc", "ICX-BTC"),
	btteth("btteth", "BTT-ETH"), filusdt("filusdt", "FIL-USDT"), trxbtc("trxbtc", "TRX-BTC"),
	bsvbtc("bsvbtc", "BSV-BTC"), aebtc("aebtc", "AE-BTC"), wnxmusdt("wnxmusdt", "WNXM-USDT"),
	grteth("grteth", "GRT-ETH"), qunbtc("qunbtc", "QUN-BTC"), lbausdt("lbausdt", "LBA-USDT"),
	iostusdt("iostusdt", "IOST-USDT"), nasusdt("nasusdt", "NAS-USDT"), elfusdt("elfusdt", "ELF-USDT"),
	atomusdt("atomusdt", "ATOM-USDT"), manaeth("manaeth", "MANA-ETH"), zilbtc("zilbtc", "ZIL-BTC"),
	rsrusdt("rsrusdt", "RSR-USDT"), qtumbtc("qtumbtc", "QTUM-BTC"), swftceth("swftceth", "SWFTC-ETH"),
	compbtc("compbtc", "COMP-BTC"), letbtc("letbtc", "LET-BTC"), gnxbtc("gnxbtc", "GNX-BTC"),
	daiusdt("daiusdt", "DAI-USDT"), sushiusdt("sushiusdt", "SUSHI-USDT"), mlnusdt("mlnusdt", "MLN-USDT"),
	ltcbtc("ltcbtc", "LTC-BTC"), trbbtc("trbbtc", "TRB-BTC"), nearusdt("nearusdt", "NEAR-USDT"),
	itcusdt("itcusdt", "ITC-USDT"), solbtc("solbtc", "SOL-BTC"), aaveusdt("aaveusdt", "AAVE-USDT"),
	yfiiusdt("yfiiusdt", "YFII-USDT"), iosteth("iosteth", "IOST-ETH"), jstusdt("jstusdt", "JST-USDT"),
	aavebtc("aavebtc", "AAVE-BTC"), crvusdt("crvusdt", "CRV-USDT"), fsnusdt("fsnusdt", "FSN-USDT"),
	cmtusdt("cmtusdt", "CMT-USDT"), rvnbtc("rvnbtc", "RVN-BTC"), letusdt("letusdt", "LET-USDT"),
	swftcusdt("swftcusdt", "SWFTC-USDT"), wxtbtc("wxtbtc", "WXT-BTC"), bsvusdt("bsvusdt", "BSV-USDT"),
	crvbtc("crvbtc", "CRV-BTC"), nanousdt("nanousdt", "NANO-USDT"), crousdt("crousdt", "CRO-USDT"),
	wavesusdt("wavesusdt", "WAVES-USDT"), nasbtc("nasbtc", "NAS-BTC"), ctxcbtc("ctxcbtc", "CTXC-BTC"),
	uniusdt("uniusdt", "UNI-USDT"), yfiusdt("yfiusdt", "YFI-USDT"), bchbtc("bchbtc", "BCH-BTC"),
	algobtc("algobtc", "ALGO-BTC"), bcxbtc("bcxbtc", "BCX-BTC"), snxeth("snxeth", "SNX-ETH"),
	ethusdt("ethusdt", "ETH-USDT"), scbtc("scbtc", "SC-BTC"), soleth("soleth", "SOL-ETH"),
	dashbtc("dashbtc", "DASH-BTC"), dogeusdt("dogeusdt", "DOGE-USDT"), unibtc("unibtc", "UNI-BTC"),
	iostbtc("iostbtc", "IOST-BTC"), thetabtc("thetabtc", "THETA-BTC"), kcasheth("kcasheth", "KCASH-ETH"),
	btmeth("btmeth", "BTM-ETH"), kncusdt("kncusdt", "KNC-USDT"), linkbtc("linkbtc", "LINK-BTC"),
	xrpbtc("xrpbtc", "XRP-BTC"), mkreth("mkreth", "MKR-ETH"), hcbtc("hcbtc", "HC-BTC"),
	aeusdt("aeusdt", "AE-USDT"), dotbtc("dotbtc", "DOT-BTC"), bandeth("bandeth", "BAND-ETH"),
	sunusdt("sunusdt", "SUN-USDT"), neareth("neareth", "NEAR-ETH"), xmreth("xmreth", "XMR-ETH"),
	onteth("onteth", "ONT-ETH"), mlneth("mlneth", "MLN-ETH"), xemusdt("xemusdt", "XEM-USDT"),
	ltcusdt("ltcusdt", "LTC-USDT"), waveseth("waveseth", "WAVES-ETH"), sntbtc("sntbtc", "SNT-BTC"),
	storjusdt("storjusdt", "STORJ-USDT"), zrxbtc("zrxbtc", "ZRX-BTC"), qtumusdt("qtumusdt", "QTUM-USDT"),
	nulsbtc("nulsbtc", "NULS-BTC"), antbtc("antbtc", "ANT-BTC"), neobtc("neobtc", "NEO-BTC"),
	btcusdt("btcusdt", "BTC-USDT"), omgusdt("omgusdt", "OMG-USDT"), btmusdt("btmusdt", "BTM-USDT"),
	egtbtc("egtbtc", "EGT-BTC"), emusdt("emusdt", "EM-USDT"), avaxeth("avaxeth", "AVAX-ETH"),
	wtcbtc("wtcbtc", "WTC-BTC"), faireth("faireth", "FAIR-ETH"), iotaeth("iotaeth", "IOTA-ETH"),
	sushieth("sushieth", "SUSHI-ETH"), nanoeth("nanoeth", "NANO-ETH"), batbtc("batbtc", "BAT-BTC"),
	cvceth("cvceth", "CVC-ETH"), kcashusdt("kcashusdt", "KCASH-USDT"), bntbtc("bntbtc", "BNT-BTC"),
	etcbtc("etcbtc", "ETC-BTC"), neousdt("neousdt", "NEO-USDT"), lskbtc("lskbtc", "LSK-BTC"),
	kaneth("kaneth", "KAN-ETH"), elfeth("elfeth", "ELF-ETH"), balusdt("balusdt", "BAL-USDT"),
	nulsusdt("nulsusdt", "NULS-USDT"), iotausdt("iotausdt", "IOTA-USDT"), omgbtc("omgbtc", "OMG-BTC"),
	valueusdt("valueusdt", "VALUE-USDT"), ethbtc("ethbtc", "ETH-BTC"), yeeusdt("yeeusdt", "YEE-USDT"),
	grtbtc("grtbtc", "GRT-BTC"), fileth("fileth", "FIL-ETH"), vsysusdt("vsysusdt", "VSYS-USDT"),
	frontusdt("frontusdt", "FRONT-USDT"), zrxusdt("zrxusdt", "ZRX-USDT"), eosusdt("eosusdt", "EOS-USDT"),
	batusdt("batusdt", "BAT-USDT"), algoeth("algoeth", "ALGO-ETH"), itcbtc("itcbtc", "ITC-BTC"),
	algousdt("algousdt", "ALGO-USDT"), adaeth("adaeth", "ADA-ETH"), wtceth("wtceth", "WTC-ETH"),
	trbeth("trbeth", "TRB-ETH"), aaveeth("aaveeth", "AAVE-ETH"), crobtc("crobtc", "CRO-BTC"),
	lbabtc("lbabtc", "LBA-BTC"), sntusdt("sntusdt", "SNT-USDT"), dashusdt("dashusdt", "DASH-USDT"),
	xmrusdt("xmrusdt", "XMR-USDT"), astusdt("astusdt", "AST-USDT"), mkrbtc("mkrbtc", "MKR-BTC"),
	trbusdt("trbusdt", "TRB-USDT"), bntusdt("bntusdt", "BNT-USDT"), elfbtc("elfbtc", "ELF-BTC"),
	cmteth("cmteth", "CMT-ETH"), omgeth("omgeth", "OMG-ETH"), manausdt("manausdt", "MANA-USDT"),
	suneth("suneth", "SUN-ETH"), umausdt("umausdt", "UMA-USDT"), ksmbtc("ksmbtc", "KSM-BTC"),
	etcusdt("etcusdt", "ETC-USDT"), socusdt("socusdt", "SOC-USDT"), iotabtc("iotabtc", "IOTA-BTC"),
	naseth("naseth", "NAS-ETH"), ctxceth("ctxceth", "CTXC-ETH"), swrvusdt("swrvusdt", "SWRV-USDT"),
	fronteth("fronteth", "FRONT-ETH"), zenbtc("zenbtc", "ZEN-BTC"), topceth("topceth", "TOPC-ETH"),
	crveth("crveth", "CRV-ETH"), kcashbtc("kcashbtc", "KCASH-BTC"), wbtcbtc("wbtcbtc", "WBTC-BTC"),
	zilusdt("zilusdt", "ZIL-USDT"), xlmusdt("xlmusdt", "XLM-USDT"), jstbtc("jstbtc", "JST-BTC"),
	cvpusdt("cvpusdt", "CVP-USDT"), unieth("unieth", "UNI-ETH"), actbtc("actbtc", "ACT-BTC"),
	xlmbtc("xlmbtc", "XLM-BTC"), yfieth("yfieth", "YFI-ETH"), lrcbtc("lrcbtc", "LRC-BTC"),
	zecbtc("zecbtc", "ZEC-BTC"), reneth("reneth", "REN-ETH"), hceth("hceth", "HC-ETH"),
	snxusdt("snxusdt", "SNX-USDT"), mkrusdt("mkrusdt", "MKR-USDT"), eoseth("eoseth", "EOS-ETH"),
	dcrusdt("dcrusdt", "DCR-USDT"), xtzusdt("xtzusdt", "XTZ-USDT"), vsysbtc("vsysbtc", "VSYS-BTC"),
	manabtc("manabtc", "MANA-BTC"), abteth("abteth", "ABT-ETH"), gaseth("gaseth", "GAS-ETH"),
	rsrbtc("rsrbtc", "RSR-BTC"), aeeth("aeeth", "AE-ETH"), compusdt("compusdt", "COMP-USDT"),
	zileth("zileth", "ZIL-ETH"), wtcusdt("wtcusdt", "WTC-USDT"), bchusdt("bchusdt", "BCH-USDT"),
	hbarusdt("hbarusdt", "HBAR-USDT"), valueeth("valueeth", "VALUE-ETH"), triobtc("triobtc", "TRIO-BTC"),
	bttbtc("bttbtc", "BTT-BTC"), icxusdt("icxusdt", "ICX-USDT"), wavesbtc("wavesbtc", "WAVES-BTC"),
	rvnusdt("rvnusdt", "RVN-USDT"), gnxeth("gnxeth", "GNX-ETH"), ontusdt("ontusdt", "ONT-USDT"),
	avaxbtc("avaxbtc", "AVAX-BTC"), kanusdt("kanusdt", "KAN-USDT"), dotusdt("dotusdt", "DOT-USDT"),
	wnxmeth("wnxmeth", "WNXM-ETH"), wxtusdt("wxtusdt", "WXT-USDT"), actusdt("actusdt", "ACT-USDT"),
	qtumeth("qtumeth", "QTUM-ETH"), hbarbtc("hbarbtc", "HBAR-BTC"), swftcbtc("swftcbtc", "SWFTC-BTC"),
	sncbtc("sncbtc", "SNC-BTC"), linkusdt("linkusdt", "LINK-USDT"), gasbtc("gasbtc", "GAS-BTC"),
	lrcusdt("lrcusdt", "LRC-USDT"), ksmusdt("ksmusdt", "KSM-USDT"), cvcbtc("cvcbtc", "CVC-BTC"),
	yfibtc("yfibtc", "YFI-BTC"), renbtc("renbtc", "REN-BTC"), thetausdt("thetausdt", "THETA-USDT"),
	antusdt("antusdt", "ANT-USDT"), filbtc("filbtc", "FIL-BTC"), nanobtc("nanobtc", "NANO-BTC"),
	sbtcbtc("sbtcbtc", "SBTC-BTC"), lambusdt("lambusdt", "LAMB-USDT"), xrpusdt("xrpusdt", "XRP-USDT"),
	abtusdt("abtusdt", "ABT-USDT"), xembtc("xembtc", "XEM-BTC"), dhteth("dhteth", "DHT-ETH"),
	bttusdt("bttusdt", "BTT-USDT"), bandusdt("bandusdt", "BAND-USDT"), cvpeth("cvpeth", "CVP-ETH"),
	solusdt("solusdt", "SOL-USDT"), trxusdt("trxusdt", "TRX-USDT"), btmbtc("btmbtc", "BTM-BTC"),
	adabtc("adabtc", "ADA-BTC"), sceth("sceth", "SC-ETH"), dgbbtc("dgbbtc", "DGB-BTC"),
	linketh("linketh", "LINK-ETH"), botusdt("botusdt", "BOT-USDT"), dcrbtc("dcrbtc", "DCR-BTC"),
	grtusdt("grtusdt", "GRT-USDT"), atometh("atometh", "ATOM-ETH"), abtbtc("abtbtc", "ABT-BTC"),
	balbtc("balbtc", "BAL-BTC"), cmtbtc("cmtbtc", "CMT-BTC"), umaeth("umaeth", "UMA-ETH"),
	zeneth("zeneth", "ZEN-ETH"), bchausdt("bchausdt", "BCHA-USDT"), xlmeth("xlmeth", "XLM-ETH"),
	renusdt("renusdt", "REN-USDT"), socbtc("socbtc", "SOC-BTC"), bchabtc("bchabtc", "BCHA-BTC"),
	xmrbtc("xmrbtc", "XMR-BTC"), trxeth("trxeth", "TRX-ETH"), cvcusdt("cvcusdt", "CVC-USDT"),
	xtzbtc("xtzbtc", "XTZ-BTC"), bcdbtc("bcdbtc", "BCD-BTC"), egtusdt("egtusdt", "EGT-USDT"),
	zrxeth("zrxeth", "ZRX-ETH"), chatbtc("chatbtc", "CHAT-BTC"), nulseth("nulseth", "NULS-ETH"),
	nearbtc("nearbtc", "NEAR-BTC"), zecusdt("zecusdt", "ZEC-USDT"), boteth("boteth", "BOT-ETH");

	private String key;
	private String value;

	HuobiOkxeChannelEnum(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public static String getValue(String key) {
		HuobiOkxeChannelEnum[] values = HuobiOkxeChannelEnum.values();
		for (HuobiOkxeChannelEnum okxeChannelEnum : values) {
			if (okxeChannelEnum.getKey().equals(key)) {
				return okxeChannelEnum.getValue();
			}
		}
		return null;
	}
	
	
	public static List<String> getAllKeyList(){
		List<String> arrayList = new ArrayList<String>();
		HuobiOkxeChannelEnum[] values = HuobiOkxeChannelEnum.values();
		for (HuobiOkxeChannelEnum okxeChannelEnum : values) {
			arrayList.add(okxeChannelEnum.key);
		}
		return arrayList;
	}
	
	public static String getAllKeyString(){
		HuobiOkxeChannelEnum[] values = HuobiOkxeChannelEnum.values();
		String str="";
		for (HuobiOkxeChannelEnum okxeChannelEnum : values) {
			str+=okxeChannelEnum.getKey()+",";
		}
		return str.substring(0,str.length()-1);
	}

	public static String getKey(String value) {
		HuobiOkxeChannelEnum[] values = HuobiOkxeChannelEnum.values();
		for (HuobiOkxeChannelEnum okxeChannelEnum : values) {
			if (okxeChannelEnum.getValue().equals(value)) {
				return okxeChannelEnum.getKey();
			}
		}
		return null;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
