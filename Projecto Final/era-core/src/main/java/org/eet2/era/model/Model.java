package org.eet2.era.model;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Model {

	private Map<KPI, BigDecimal> kpis = new HashMap<KPI, BigDecimal>();

	public Model(){
		this.kpiLoad();
	}
	
	public void add(KPI kpi, BigDecimal value) {
		kpis.put(kpi, value);
	}

	public BigDecimal getValue(KPI kpi) {
		return this.kpis.get(kpi);
	}
	
	protected void kpiLoad(){
				
		//CLASIFICAR de 0 a 100 
		this.add(KPI.GUSTO_POR_LA_MATERIA, new BigDecimal(10));
		this.add(KPI.MATERIAL, new BigDecimal(70));
		this.add(KPI.TP_GRUPO, new BigDecimal(50));
		this.add(KPI.TP_SOLO, new BigDecimal(50));
		// de 0 a 10 , ES EN HORAS
		this.add(KPI.TIEMPO_DEDICADO, new BigDecimal(2));
		this.add(KPI.TIEMPO_DEMANDADO, new BigDecimal(8));
		//CLASIFICAR de 0 a 10
		this.add(KPI.AYUDA_EXTRA, new BigDecimal(0));
		this.add(KPI.DIFICULTAD, new BigDecimal(4));
		this.add(KPI.ATENCION_EN_CLASE, new BigDecimal(1));	
	
	}

	public void loadFromFile(String fileName) {
		this.kpis.clear();
		this.kpiLoad();

//		try {
////			this.kpis.clear();
////			
////			ClassLoader loader = this.getClass().getClassLoader();
////			InputStream stream = loader.getResourceAsStream(fileName);
////			Properties props = new Properties();
////			props.load(stream);
//
////			for (KPI kpi : KPI.values()) {
////				if (props.containsKey(kpi.name())) {
////					kpis.put(kpi, new BigDecimal(props.getProperty(kpi.name())));
////				}
////			}
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}
	}

}
