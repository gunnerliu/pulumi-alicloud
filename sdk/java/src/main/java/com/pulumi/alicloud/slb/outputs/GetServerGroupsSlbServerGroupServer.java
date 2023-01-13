// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerGroupsSlbServerGroupServer {
    /**
     * @return ID of the attached ECS instance.
     * 
     */
    private String instanceId;
    /**
     * @return Weight associated to the ECS instance.
     * 
     */
    private Integer weight;

    private GetServerGroupsSlbServerGroupServer() {}
    /**
     * @return ID of the attached ECS instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return Weight associated to the ECS instance.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerGroupsSlbServerGroupServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String instanceId;
        private Integer weight;
        public Builder() {}
        public Builder(GetServerGroupsSlbServerGroupServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }
        public GetServerGroupsSlbServerGroupServer build() {
            final var o = new GetServerGroupsSlbServerGroupServer();
            o.instanceId = instanceId;
            o.weight = weight;
            return o;
        }
    }
}
