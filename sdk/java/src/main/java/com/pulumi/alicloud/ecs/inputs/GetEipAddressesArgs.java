// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEipAddressesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEipAddressesArgs Empty = new GetEipAddressesArgs();

    /**
     * The name of the EIP.
     * 
     */
    @Import(name="addressName")
    private @Nullable Output<String> addressName;

    /**
     * @return The name of the EIP.
     * 
     */
    public Optional<Output<String>> addressName() {
        return Optional.ofNullable(this.addressName);
    }

    /**
     * The associated instance id.
     * 
     */
    @Import(name="associatedInstanceId")
    private @Nullable Output<String> associatedInstanceId;

    /**
     * @return The associated instance id.
     * 
     */
    public Optional<Output<String>> associatedInstanceId() {
        return Optional.ofNullable(this.associatedInstanceId);
    }

    /**
     * The associated instance type.
     * 
     */
    @Import(name="associatedInstanceType")
    private @Nullable Output<String> associatedInstanceType;

    /**
     * @return The associated instance type.
     * 
     */
    public Optional<Output<String>> associatedInstanceType() {
        return Optional.ofNullable(this.associatedInstanceType);
    }

    /**
     * The dry run.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * Default to `tue`. Set it to `false` can hidden the `tags` to output.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Output<Boolean> enableDetails;

    /**
     * @return Default to `tue`. Set it to `false` can hidden the `tags` to output.
     * 
     */
    public Optional<Output<Boolean>> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of Address IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Address IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The include reservation data. Valid values: `BGP` and `BGP_PRO`.
     * 
     */
    @Import(name="includeReservationData")
    private @Nullable Output<Boolean> includeReservationData;

    /**
     * @return The include reservation data. Valid values: `BGP` and `BGP_PRO`.
     * 
     */
    public Optional<Output<Boolean>> includeReservationData() {
        return Optional.ofNullable(this.includeReservationData);
    }

    /**
     * The IP address of the EIP.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return The IP address of the EIP.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * @deprecated
     * Field &#39;ip_addresses&#39; has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute &#39;ip_address&#39; instead.
     * 
     */
    @Deprecated /* Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'ip_address' instead. */
    @Import(name="ipAddresses")
    private @Nullable Output<List<String>> ipAddresses;

    /**
     * @deprecated
     * Field &#39;ip_addresses&#39; has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute &#39;ip_address&#39; instead.
     * 
     */
    @Deprecated /* Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'ip_address' instead. */
    public Optional<Output<List<String>>> ipAddresses() {
        return Optional.ofNullable(this.ipAddresses);
    }

    /**
     * The Internet service provider (ISP).
     * 
     */
    @Import(name="isp")
    private @Nullable Output<String> isp;

    /**
     * @return The Internet service provider (ISP).
     * 
     */
    public Optional<Output<String>> isp() {
        return Optional.ofNullable(this.isp);
    }

    /**
     * The lock reason.
     * 
     */
    @Import(name="lockReason")
    private @Nullable Output<String> lockReason;

    /**
     * @return The lock reason.
     * 
     */
    public Optional<Output<String>> lockReason() {
        return Optional.ofNullable(this.lockReason);
    }

    /**
     * A regex string to filter results by Address name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Address name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The billing method of the EIP.
     * 
     */
    @Import(name="paymentType")
    private @Nullable Output<String> paymentType;

    /**
     * @return The billing method of the EIP.
     * 
     */
    public Optional<Output<String>> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The IDs of the contiguous EIPs.
     * 
     */
    @Import(name="segmentInstanceId")
    private @Nullable Output<String> segmentInstanceId;

    /**
     * @return The IDs of the contiguous EIPs.
     * 
     */
    public Optional<Output<String>> segmentInstanceId() {
        return Optional.ofNullable(this.segmentInstanceId);
    }

    /**
     * The status of the EIP.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the EIP.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
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

    private GetEipAddressesArgs() {}

    private GetEipAddressesArgs(GetEipAddressesArgs $) {
        this.addressName = $.addressName;
        this.associatedInstanceId = $.associatedInstanceId;
        this.associatedInstanceType = $.associatedInstanceType;
        this.dryRun = $.dryRun;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.includeReservationData = $.includeReservationData;
        this.ipAddress = $.ipAddress;
        this.ipAddresses = $.ipAddresses;
        this.isp = $.isp;
        this.lockReason = $.lockReason;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.paymentType = $.paymentType;
        this.resourceGroupId = $.resourceGroupId;
        this.segmentInstanceId = $.segmentInstanceId;
        this.status = $.status;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEipAddressesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEipAddressesArgs $;

        public Builder() {
            $ = new GetEipAddressesArgs();
        }

        public Builder(GetEipAddressesArgs defaults) {
            $ = new GetEipAddressesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressName The name of the EIP.
         * 
         * @return builder
         * 
         */
        public Builder addressName(@Nullable Output<String> addressName) {
            $.addressName = addressName;
            return this;
        }

        /**
         * @param addressName The name of the EIP.
         * 
         * @return builder
         * 
         */
        public Builder addressName(String addressName) {
            return addressName(Output.of(addressName));
        }

        /**
         * @param associatedInstanceId The associated instance id.
         * 
         * @return builder
         * 
         */
        public Builder associatedInstanceId(@Nullable Output<String> associatedInstanceId) {
            $.associatedInstanceId = associatedInstanceId;
            return this;
        }

        /**
         * @param associatedInstanceId The associated instance id.
         * 
         * @return builder
         * 
         */
        public Builder associatedInstanceId(String associatedInstanceId) {
            return associatedInstanceId(Output.of(associatedInstanceId));
        }

        /**
         * @param associatedInstanceType The associated instance type.
         * 
         * @return builder
         * 
         */
        public Builder associatedInstanceType(@Nullable Output<String> associatedInstanceType) {
            $.associatedInstanceType = associatedInstanceType;
            return this;
        }

        /**
         * @param associatedInstanceType The associated instance type.
         * 
         * @return builder
         * 
         */
        public Builder associatedInstanceType(String associatedInstanceType) {
            return associatedInstanceType(Output.of(associatedInstanceType));
        }

        /**
         * @param dryRun The dry run.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun The dry run.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param enableDetails Default to `tue`. Set it to `false` can hidden the `tags` to output.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Output<Boolean> enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param enableDetails Default to `tue`. Set it to `false` can hidden the `tags` to output.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(Boolean enableDetails) {
            return enableDetails(Output.of(enableDetails));
        }

        /**
         * @param ids A list of Address IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Address IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Address IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param includeReservationData The include reservation data. Valid values: `BGP` and `BGP_PRO`.
         * 
         * @return builder
         * 
         */
        public Builder includeReservationData(@Nullable Output<Boolean> includeReservationData) {
            $.includeReservationData = includeReservationData;
            return this;
        }

        /**
         * @param includeReservationData The include reservation data. Valid values: `BGP` and `BGP_PRO`.
         * 
         * @return builder
         * 
         */
        public Builder includeReservationData(Boolean includeReservationData) {
            return includeReservationData(Output.of(includeReservationData));
        }

        /**
         * @param ipAddress The IP address of the EIP.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The IP address of the EIP.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Field &#39;ip_addresses&#39; has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute &#39;ip_address&#39; instead.
         * 
         */
        @Deprecated /* Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'ip_address' instead. */
        public Builder ipAddresses(@Nullable Output<List<String>> ipAddresses) {
            $.ipAddresses = ipAddresses;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Field &#39;ip_addresses&#39; has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute &#39;ip_address&#39; instead.
         * 
         */
        @Deprecated /* Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'ip_address' instead. */
        public Builder ipAddresses(List<String> ipAddresses) {
            return ipAddresses(Output.of(ipAddresses));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Field &#39;ip_addresses&#39; has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute &#39;ip_address&#39; instead.
         * 
         */
        @Deprecated /* Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'ip_address' instead. */
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }

        /**
         * @param isp The Internet service provider (ISP).
         * 
         * @return builder
         * 
         */
        public Builder isp(@Nullable Output<String> isp) {
            $.isp = isp;
            return this;
        }

        /**
         * @param isp The Internet service provider (ISP).
         * 
         * @return builder
         * 
         */
        public Builder isp(String isp) {
            return isp(Output.of(isp));
        }

        /**
         * @param lockReason The lock reason.
         * 
         * @return builder
         * 
         */
        public Builder lockReason(@Nullable Output<String> lockReason) {
            $.lockReason = lockReason;
            return this;
        }

        /**
         * @param lockReason The lock reason.
         * 
         * @return builder
         * 
         */
        public Builder lockReason(String lockReason) {
            return lockReason(Output.of(lockReason));
        }

        /**
         * @param nameRegex A regex string to filter results by Address name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Address name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param paymentType The billing method of the EIP.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType The billing method of the EIP.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param segmentInstanceId The IDs of the contiguous EIPs.
         * 
         * @return builder
         * 
         */
        public Builder segmentInstanceId(@Nullable Output<String> segmentInstanceId) {
            $.segmentInstanceId = segmentInstanceId;
            return this;
        }

        /**
         * @param segmentInstanceId The IDs of the contiguous EIPs.
         * 
         * @return builder
         * 
         */
        public Builder segmentInstanceId(String segmentInstanceId) {
            return segmentInstanceId(Output.of(segmentInstanceId));
        }

        /**
         * @param status The status of the EIP.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the EIP.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
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

        public GetEipAddressesArgs build() {
            return $;
        }
    }

}
