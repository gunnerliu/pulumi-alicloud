// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.securitycenter.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceLinkedRoleState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLinkedRoleState Empty = new ServiceLinkedRoleState();

    /**
     * The status of the service Associated role. Valid Values: `true`: Created. `false`: not created.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Boolean> status;

    /**
     * @return The status of the service Associated role. Valid Values: `true`: Created. `false`: not created.
     * 
     */
    public Optional<Output<Boolean>> status() {
        return Optional.ofNullable(this.status);
    }

    private ServiceLinkedRoleState() {}

    private ServiceLinkedRoleState(ServiceLinkedRoleState $) {
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLinkedRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLinkedRoleState $;

        public Builder() {
            $ = new ServiceLinkedRoleState();
        }

        public Builder(ServiceLinkedRoleState defaults) {
            $ = new ServiceLinkedRoleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param status The status of the service Associated role. Valid Values: `true`: Created. `false`: not created.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Boolean> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the service Associated role. Valid Values: `true`: Created. `false`: not created.
         * 
         * @return builder
         * 
         */
        public Builder status(Boolean status) {
            return status(Output.of(status));
        }

        public ServiceLinkedRoleState build() {
            return $;
        }
    }

}
