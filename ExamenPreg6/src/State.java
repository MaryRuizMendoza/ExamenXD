
public class State {
	private Long stateId;
	private String description;
	private ShippingZone shippingZone;
	
	
	public State(Long stateId, String description) {
		this.stateId = stateId;
		this.description = description;
	}
	
	public State() {}
	public Long getStateId() {
		return stateId;
	}
	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", description=" + description + "]";
	}
		
}

