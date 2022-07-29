// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGatewaysPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewaysPlainArgs Empty = new GetGatewaysPlainArgs();

    /**
     * Limit search to specific business status - valid value is &#34;Normal&#34;, &#34;FinancialLocked&#34;.
     * 
     */
    @Import(name="businessStatus")
    private @Nullable String businessStatus;

    /**
     * @return Limit search to specific business status - valid value is &#34;Normal&#34;, &#34;FinancialLocked&#34;.
     * 
     */
    public Optional<String> businessStatus() {
        return Optional.ofNullable(this.businessStatus);
    }

    /**
     * Indicates whether the IPsec-VPN feature is enabled.
     * 
     */
    @Import(name="enableIpsec")
    private @Nullable Boolean enableIpsec;

    /**
     * @return Indicates whether the IPsec-VPN feature is enabled.
     * 
     */
    public Optional<Boolean> enableIpsec() {
        return Optional.ofNullable(this.enableIpsec);
    }

    /**
     * IDs of the VPN.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return IDs of the VPN.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string of VPN name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string of VPN name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * Save the result to the file.
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return Save the result to the file.
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * Limit search to specific status - valid value is &#34;Init&#34;, &#34;Provisioning&#34;, &#34;Active&#34;, &#34;Updating&#34;, &#34;Deleting&#34;.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return Limit search to specific status - valid value is &#34;Init&#34;, &#34;Provisioning&#34;, &#34;Active&#34;, &#34;Updating&#34;, &#34;Deleting&#34;.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Use the VPC ID as the search key.
     * 
     */
    @Import(name="vpcId")
    private @Nullable String vpcId;

    /**
     * @return Use the VPC ID as the search key.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private GetGatewaysPlainArgs() {}

    private GetGatewaysPlainArgs(GetGatewaysPlainArgs $) {
        this.businessStatus = $.businessStatus;
        this.enableIpsec = $.enableIpsec;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.status = $.status;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGatewaysPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGatewaysPlainArgs $;

        public Builder() {
            $ = new GetGatewaysPlainArgs();
        }

        public Builder(GetGatewaysPlainArgs defaults) {
            $ = new GetGatewaysPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param businessStatus Limit search to specific business status - valid value is &#34;Normal&#34;, &#34;FinancialLocked&#34;.
         * 
         * @return builder
         * 
         */
        public Builder businessStatus(@Nullable String businessStatus) {
            $.businessStatus = businessStatus;
            return this;
        }

        /**
         * @param enableIpsec Indicates whether the IPsec-VPN feature is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableIpsec(@Nullable Boolean enableIpsec) {
            $.enableIpsec = enableIpsec;
            return this;
        }

        /**
         * @param ids IDs of the VPN.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids IDs of the VPN.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string of VPN name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param outputFile Save the result to the file.
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param status Limit search to specific status - valid value is &#34;Init&#34;, &#34;Provisioning&#34;, &#34;Active&#34;, &#34;Updating&#34;, &#34;Deleting&#34;.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param vpcId Use the VPC ID as the search key.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable String vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public GetGatewaysPlainArgs build() {
            return $;
        }
    }

}
