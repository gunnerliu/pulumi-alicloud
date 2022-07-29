// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReservedInstanceState extends com.pulumi.resources.ResourceArgs {

    public static final ReservedInstanceState Empty = new ReservedInstanceState();

    /**
     * Description of the RI. 2 to 256 English or Chinese characters. It cannot start with http:// or https://.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the RI. 2 to 256 English or Chinese characters. It cannot start with http:// or https://.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Number of instances allocated to an RI (An RI is a coupon that includes one or more allocated instances.).
     * 
     */
    @Import(name="instanceAmount")
    private @Nullable Output<Integer> instanceAmount;

    /**
     * @return Number of instances allocated to an RI (An RI is a coupon that includes one or more allocated instances.).
     * 
     */
    public Optional<Output<Integer>> instanceAmount() {
        return Optional.ofNullable(this.instanceAmount);
    }

    /**
     * Instance type of the RI. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.html).
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return Instance type of the RI. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.html).
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * Name of the RI. The name must be a string of 2 to 128 characters in length and can contain letters, numbers, colons (:), underscores (_), and hyphens. It must start with a letter. It cannot start with http:// or https://.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the RI. The name must be a string of 2 to 128 characters in length and can contain letters, numbers, colons (:), underscores (_), and hyphens. It must start with a letter. It cannot start with http:// or https://.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Payment type of the RI. Optional values: `No Upfront`: No upfront payment is required., `Partial Upfront`: A portion of upfront payment is required.`All Upfront`: Full upfront payment is required.
     * 
     */
    @Import(name="offeringType")
    private @Nullable Output<String> offeringType;

    /**
     * @return Payment type of the RI. Optional values: `No Upfront`: No upfront payment is required., `Partial Upfront`: A portion of upfront payment is required.`All Upfront`: Full upfront payment is required.
     * 
     */
    public Optional<Output<String>> offeringType() {
        return Optional.ofNullable(this.offeringType);
    }

    @Import(name="period")
    private @Nullable Output<Integer> period;

    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * Term unit. Optional value: Year.
     * 
     */
    @Import(name="periodUnit")
    private @Nullable Output<String> periodUnit;

    /**
     * @return Term unit. Optional value: Year.
     * 
     */
    public Optional<Output<String>> periodUnit() {
        return Optional.ofNullable(this.periodUnit);
    }

    /**
     * The operating system type of the image used by the instance. Optional values: `Windows`, `Linux`. Default is `Linux`.
     * 
     */
    @Import(name="platform")
    private @Nullable Output<String> platform;

    /**
     * @return The operating system type of the image used by the instance. Optional values: `Windows`, `Linux`. Default is `Linux`.
     * 
     */
    public Optional<Output<String>> platform() {
        return Optional.ofNullable(this.platform);
    }

    /**
     * Resource group ID.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return Resource group ID.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * Scope of the RI. Optional values: `Region`: region-level, `Zone`: zone-level. Default is `Region`.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return Scope of the RI. Optional values: `Region`: region-level, `Zone`: zone-level. Default is `Region`.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * ID of the zone to which the RI belongs. When Scope is set to Zone, this parameter is required. For information about the zone list, see [DescribeZones](https://www.alibabacloud.com/help/doc-detail/25610.html).
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return ID of the zone to which the RI belongs. When Scope is set to Zone, this parameter is required. For information about the zone list, see [DescribeZones](https://www.alibabacloud.com/help/doc-detail/25610.html).
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private ReservedInstanceState() {}

    private ReservedInstanceState(ReservedInstanceState $) {
        this.description = $.description;
        this.instanceAmount = $.instanceAmount;
        this.instanceType = $.instanceType;
        this.name = $.name;
        this.offeringType = $.offeringType;
        this.period = $.period;
        this.periodUnit = $.periodUnit;
        this.platform = $.platform;
        this.resourceGroupId = $.resourceGroupId;
        this.scope = $.scope;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservedInstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservedInstanceState $;

        public Builder() {
            $ = new ReservedInstanceState();
        }

        public Builder(ReservedInstanceState defaults) {
            $ = new ReservedInstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the RI. 2 to 256 English or Chinese characters. It cannot start with http:// or https://.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the RI. 2 to 256 English or Chinese characters. It cannot start with http:// or https://.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param instanceAmount Number of instances allocated to an RI (An RI is a coupon that includes one or more allocated instances.).
         * 
         * @return builder
         * 
         */
        public Builder instanceAmount(@Nullable Output<Integer> instanceAmount) {
            $.instanceAmount = instanceAmount;
            return this;
        }

        /**
         * @param instanceAmount Number of instances allocated to an RI (An RI is a coupon that includes one or more allocated instances.).
         * 
         * @return builder
         * 
         */
        public Builder instanceAmount(Integer instanceAmount) {
            return instanceAmount(Output.of(instanceAmount));
        }

        /**
         * @param instanceType Instance type of the RI. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.html).
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType Instance type of the RI. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.html).
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param name Name of the RI. The name must be a string of 2 to 128 characters in length and can contain letters, numbers, colons (:), underscores (_), and hyphens. It must start with a letter. It cannot start with http:// or https://.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the RI. The name must be a string of 2 to 128 characters in length and can contain letters, numbers, colons (:), underscores (_), and hyphens. It must start with a letter. It cannot start with http:// or https://.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param offeringType Payment type of the RI. Optional values: `No Upfront`: No upfront payment is required., `Partial Upfront`: A portion of upfront payment is required.`All Upfront`: Full upfront payment is required.
         * 
         * @return builder
         * 
         */
        public Builder offeringType(@Nullable Output<String> offeringType) {
            $.offeringType = offeringType;
            return this;
        }

        /**
         * @param offeringType Payment type of the RI. Optional values: `No Upfront`: No upfront payment is required., `Partial Upfront`: A portion of upfront payment is required.`All Upfront`: Full upfront payment is required.
         * 
         * @return builder
         * 
         */
        public Builder offeringType(String offeringType) {
            return offeringType(Output.of(offeringType));
        }

        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param periodUnit Term unit. Optional value: Year.
         * 
         * @return builder
         * 
         */
        public Builder periodUnit(@Nullable Output<String> periodUnit) {
            $.periodUnit = periodUnit;
            return this;
        }

        /**
         * @param periodUnit Term unit. Optional value: Year.
         * 
         * @return builder
         * 
         */
        public Builder periodUnit(String periodUnit) {
            return periodUnit(Output.of(periodUnit));
        }

        /**
         * @param platform The operating system type of the image used by the instance. Optional values: `Windows`, `Linux`. Default is `Linux`.
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable Output<String> platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param platform The operating system type of the image used by the instance. Optional values: `Windows`, `Linux`. Default is `Linux`.
         * 
         * @return builder
         * 
         */
        public Builder platform(String platform) {
            return platform(Output.of(platform));
        }

        /**
         * @param resourceGroupId Resource group ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId Resource group ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param scope Scope of the RI. Optional values: `Region`: region-level, `Zone`: zone-level. Default is `Region`.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Scope of the RI. Optional values: `Region`: region-level, `Zone`: zone-level. Default is `Region`.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param zoneId ID of the zone to which the RI belongs. When Scope is set to Zone, this parameter is required. For information about the zone list, see [DescribeZones](https://www.alibabacloud.com/help/doc-detail/25610.html).
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId ID of the zone to which the RI belongs. When Scope is set to Zone, this parameter is required. For information about the zone list, see [DescribeZones](https://www.alibabacloud.com/help/doc-detail/25610.html).
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ReservedInstanceState build() {
            return $;
        }
    }

}
