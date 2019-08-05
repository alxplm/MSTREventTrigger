package com.alxplm.iib;

import com.ibm.broker.config.appdev.InputTerminal;
import com.ibm.broker.config.appdev.Node;
import com.ibm.broker.config.appdev.NodeProperty;
import com.ibm.broker.config.appdev.OutputTerminal;

/*** 
 * <p>  <I>EventtriggerNodeUDN</I> instance</p>
 * <p></p>
 */
public class EventtriggerNodeUDN extends Node {

	private static final long serialVersionUID = 1L;

	// Node constants
	protected final static String NODE_TYPE_NAME = "com/alxplm/iib/EventTriggerNode";
	protected final static String NODE_GRAPHIC_16 = "platform:/plugin/MSTREventTrigger/icons/full/obj16/com/alxplm/iib/EventTrigger.gif";
	protected final static String NODE_GRAPHIC_32 = "platform:/plugin/MSTREventTrigger/icons/full/obj30/com/alxplm/iib/EventTrigger.gif";

	protected final static String PROPERTY_EVENTNAME = "eventName";
	protected final static String PROPERTY_POLICYNAME = "policyName";
	protected final static String PROPERTY_POLICYPROJECT = "policyProject";

	protected NodeProperty[] getNodeProperties() {
		return new NodeProperty[] {
			new NodeProperty(EventtriggerNodeUDN.PROPERTY_EVENTNAME,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.STRING, null,"","",	"com/alxplm/iib/EventTrigger",	"MSTREventTrigger"),
			new NodeProperty(EventtriggerNodeUDN.PROPERTY_POLICYNAME,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.STRING, null,"","",	"com/alxplm/iib/EventTrigger",	"MSTREventTrigger"),
			new NodeProperty(EventtriggerNodeUDN.PROPERTY_POLICYPROJECT,		NodeProperty.Usage.OPTIONAL,	false,	NodeProperty.Type.STRING, null,"","",	"com/alxplm/iib/EventTrigger",	"MSTREventTrigger")
		};
	}

	public EventtriggerNodeUDN() {
	}

	public final InputTerminal INPUT_TERMINAL_IN = new InputTerminal(this,"InTerminal.in");
	@Override
	public InputTerminal[] getInputTerminals() {
		return new InputTerminal[] {
			INPUT_TERMINAL_IN
	};
	}

	public final OutputTerminal OUTPUT_TERMINAL_FAILURE = new OutputTerminal(this,"OutTerminal.failure");
	public final OutputTerminal OUTPUT_TERMINAL_OUT = new OutputTerminal(this,"OutTerminal.out");
	@Override
	public OutputTerminal[] getOutputTerminals() {
		return new OutputTerminal[] {
			OUTPUT_TERMINAL_FAILURE,
			OUTPUT_TERMINAL_OUT
		};
	}

	@Override
	public String getTypeName() {
		return NODE_TYPE_NAME;
	}

	protected String getGraphic16() {
		return NODE_GRAPHIC_16;
	}

	protected String getGraphic32() {
		return NODE_GRAPHIC_32;
	}

	/**
	 * Set the <I>EventtriggerNodeUDN</I> "<I>Event name</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>Event name</I>"
	 */
	public EventtriggerNodeUDN setEventName(String value) {
		setProperty(EventtriggerNodeUDN.PROPERTY_EVENTNAME, value);
		return this;
	}

	/**
	 * Get the <I>EventtriggerNodeUDN</I> "<I>Event name</I>" property
	 * 
	 * @return String; the value of the property "<I>Event name</I>"
	 */
	public String getEventName() {
		return (String)getPropertyValue(EventtriggerNodeUDN.PROPERTY_EVENTNAME);
	}

	/**
	 * Set the <I>EventtriggerNodeUDN</I> "<I>policyName</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>policyName</I>"
	 */
	public EventtriggerNodeUDN setPolicyName(String value) {
		setProperty(EventtriggerNodeUDN.PROPERTY_POLICYNAME, value);
		return this;
	}

	/**
	 * Get the <I>EventtriggerNodeUDN</I> "<I>policyName</I>" property
	 * 
	 * @return String; the value of the property "<I>policyName</I>"
	 */
	public String getPolicyName() {
		return (String)getPropertyValue(EventtriggerNodeUDN.PROPERTY_POLICYNAME);
	}

	/**
	 * Set the <I>EventtriggerNodeUDN</I> "<I>policyProject</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>policyProject</I>"
	 */
	public EventtriggerNodeUDN setPolicyProject(String value) {
		setProperty(EventtriggerNodeUDN.PROPERTY_POLICYPROJECT, value);
		return this;
	}

	/**
	 * Get the <I>EventtriggerNodeUDN</I> "<I>policyProject</I>" property
	 * 
	 * @return String; the value of the property "<I>policyProject</I>"
	 */
	public String getPolicyProject() {
		return (String)getPropertyValue(EventtriggerNodeUDN.PROPERTY_POLICYPROJECT);
	}

	public String getNodeName() {
		String retVal = super.getNodeName();
		if ((retVal==null) || retVal.equals(""))
			retVal = "Event trigger";
		return retVal;
	};
}
