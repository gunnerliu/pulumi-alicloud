// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.yundun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DBAuditInstanceState extends com.pulumi.resources.ResourceArgs {

    public static final DBAuditInstanceState Empty = new DBAuditInstanceState();

    /**
     * Description of the instance. This name can have a string of 1 to 63 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the instance. This name can have a string of 1 to 63 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="period")
    private @Nullable Output<Integer> period;

    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * Plan code of the Cloud DBAudit to produce. (alpha.professional, alpha.basic, alpha.premium)
     * 
     */
    @Import(name="planCode")
    private @Nullable Output<String> planCode;

    /**
     * @return Plan code of the Cloud DBAudit to produce. (alpha.professional, alpha.basic, alpha.premium)
     * 
     */
    public Optional<Output<String>> planCode() {
        return Optional.ofNullable(this.planCode);
    }

    /**
     * The Id of resource group which the DBaudit Instance belongs. If not set, the resource is created in the default resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The Id of resource group which the DBaudit Instance belongs. If not set, the resource is created in the default resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * vSwtich ID configured to audit
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return vSwtich ID configured to audit
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private DBAuditInstanceState() {}

    private DBAuditInstanceState(DBAuditInstanceState $) {
        this.description = $.description;
        this.period = $.period;
        this.planCode = $.planCode;
        this.resourceGroupId = $.resourceGroupId;
        this.tags = $.tags;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DBAuditInstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DBAuditInstanceState $;

        public Builder() {
            $ = new DBAuditInstanceState();
        }

        public Builder(DBAuditInstanceState defaults) {
            $ = new DBAuditInstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the instance. This name can have a string of 1 to 63 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the instance. This name can have a string of 1 to 63 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param planCode Plan code of the Cloud DBAudit to produce. (alpha.professional, alpha.basic, alpha.premium)
         * 
         * @return builder
         * 
         */
        public Builder planCode(@Nullable Output<String> planCode) {
            $.planCode = planCode;
            return this;
        }

        /**
         * @param planCode Plan code of the Cloud DBAudit to produce. (alpha.professional, alpha.basic, alpha.premium)
         * 
         * @return builder
         * 
         */
        public Builder planCode(String planCode) {
            return planCode(Output.of(planCode));
        }

        /**
         * @param resourceGroupId The Id of resource group which the DBaudit Instance belongs. If not set, the resource is created in the default resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The Id of resource group which the DBaudit Instance belongs. If not set, the resource is created in the default resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vswitchId vSwtich ID configured to audit
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId vSwtich ID configured to audit
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public DBAuditInstanceState build() {
            return $;
        }
    }

}
