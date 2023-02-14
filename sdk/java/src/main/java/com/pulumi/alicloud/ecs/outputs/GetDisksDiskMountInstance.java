// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDisksDiskMountInstance {
    /**
     * @return Disk attachment time.
     * 
     */
    private String attachedTime;
    private String device;
    /**
     * @return Filter the results by the specified ECS instance ID.
     * 
     */
    private String instanceId;

    private GetDisksDiskMountInstance() {}
    /**
     * @return Disk attachment time.
     * 
     */
    public String attachedTime() {
        return this.attachedTime;
    }
    public String device() {
        return this.device;
    }
    /**
     * @return Filter the results by the specified ECS instance ID.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDisksDiskMountInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attachedTime;
        private String device;
        private String instanceId;
        public Builder() {}
        public Builder(GetDisksDiskMountInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedTime = defaults.attachedTime;
    	      this.device = defaults.device;
    	      this.instanceId = defaults.instanceId;
        }

        @CustomType.Setter
        public Builder attachedTime(String attachedTime) {
            this.attachedTime = Objects.requireNonNull(attachedTime);
            return this;
        }
        @CustomType.Setter
        public Builder device(String device) {
            this.device = Objects.requireNonNull(device);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public GetDisksDiskMountInstance build() {
            final var o = new GetDisksDiskMountInstance();
            o.attachedTime = attachedTime;
            o.device = device;
            o.instanceId = instanceId;
            return o;
        }
    }
}