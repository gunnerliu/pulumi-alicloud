// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ListenerPortRange {
    /**
     * @return The initial listening port used to receive requests and forward them to terminal nodes.
     * 
     */
    private final Integer fromPort;
    /**
     * @return The end listening port used to receive requests and forward them to terminal nodes.
     * 
     */
    private final Integer toPort;

    @CustomType.Constructor
    private ListenerPortRange(
        @CustomType.Parameter("fromPort") Integer fromPort,
        @CustomType.Parameter("toPort") Integer toPort) {
        this.fromPort = fromPort;
        this.toPort = toPort;
    }

    /**
     * @return The initial listening port used to receive requests and forward them to terminal nodes.
     * 
     */
    public Integer fromPort() {
        return this.fromPort;
    }
    /**
     * @return The end listening port used to receive requests and forward them to terminal nodes.
     * 
     */
    public Integer toPort() {
        return this.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerPortRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer fromPort;
        private Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerPortRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.toPort = defaults.toPort;
        }

        public Builder fromPort(Integer fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }
        public Builder toPort(Integer toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }        public ListenerPortRange build() {
            return new ListenerPortRange(fromPort, toPort);
        }
    }
}
