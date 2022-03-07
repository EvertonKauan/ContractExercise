package entities;

import java.util.Date;

public class Contract {
		private Date date;
		private double valuerPerHour;
		private Integer hours;
		
		public Contract(Date date, double valuerPerHour, Integer hours) {
			super();
			this.date = date;
			this.valuerPerHour = valuerPerHour;
			this.hours = hours;
		}
		
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public double getValuerPerHour() {
			return valuerPerHour;
		}
		public void setValuerPerHour(double valuerPerHour) {
			this.valuerPerHour = valuerPerHour;
		}
		public Integer getHours() {
			return hours;
		}
		public void setHours(Integer hours) {
			this.hours = hours;
		}
		
		public double totalValue() {
			return valuerPerHour*hours;
		}
		
}
