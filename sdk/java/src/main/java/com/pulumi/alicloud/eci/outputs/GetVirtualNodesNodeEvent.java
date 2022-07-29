// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVirtualNodesNodeEvent {
    /**
     * @return The number of occurrences.
     * 
     */
    private final Integer count;
    /**
     * @return The first presentation time stamp.
     * 
     */
    private final String firstTimestamp;
    /**
     * @return The most recent time stamp.
     * 
     */
    private final String lastTimestamp;
    /**
     * @return The event of the message body.
     * 
     */
    private final String message;
    /**
     * @return The name of the event.
     * 
     */
    private final String name;
    /**
     * @return The causes of the incident.
     * 
     */
    private final String reason;
    /**
     * @return The Event type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetVirtualNodesNodeEvent(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("firstTimestamp") String firstTimestamp,
        @CustomType.Parameter("lastTimestamp") String lastTimestamp,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("reason") String reason,
        @CustomType.Parameter("type") String type) {
        this.count = count;
        this.firstTimestamp = firstTimestamp;
        this.lastTimestamp = lastTimestamp;
        this.message = message;
        this.name = name;
        this.reason = reason;
        this.type = type;
    }

    /**
     * @return The number of occurrences.
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return The first presentation time stamp.
     * 
     */
    public String firstTimestamp() {
        return this.firstTimestamp;
    }
    /**
     * @return The most recent time stamp.
     * 
     */
    public String lastTimestamp() {
        return this.lastTimestamp;
    }
    /**
     * @return The event of the message body.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return The name of the event.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The causes of the incident.
     * 
     */
    public String reason() {
        return this.reason;
    }
    /**
     * @return The Event type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNodesNodeEvent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String firstTimestamp;
        private String lastTimestamp;
        private String message;
        private String name;
        private String reason;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNodesNodeEvent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.firstTimestamp = defaults.firstTimestamp;
    	      this.lastTimestamp = defaults.lastTimestamp;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.reason = defaults.reason;
    	      this.type = defaults.type;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder firstTimestamp(String firstTimestamp) {
            this.firstTimestamp = Objects.requireNonNull(firstTimestamp);
            return this;
        }
        public Builder lastTimestamp(String lastTimestamp) {
            this.lastTimestamp = Objects.requireNonNull(lastTimestamp);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder reason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetVirtualNodesNodeEvent build() {
            return new GetVirtualNodesNodeEvent(count, firstTimestamp, lastTimestamp, message, name, reason, type);
        }
    }
}
