// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNatIpCidrsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNatIpCidrsPlainArgs Empty = new GetNatIpCidrsPlainArgs();

    /**
     * A list of Nat Ip Cidr IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Nat Ip Cidr IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Nat Ip Cidr name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Nat Ip Cidr name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * The ID of the VPC NAT gateway.
     * 
     */
    @Import(name="natGatewayId", required=true)
    private String natGatewayId;

    /**
     * @return The ID of the VPC NAT gateway.
     * 
     */
    public String natGatewayId() {
        return this.natGatewayId;
    }

    /**
     * NAT IP ADDRESS the name of the root directory. Length is from `2` to `128` characters, must start with a letter or the Chinese at the beginning can contain numbers, half a period (.), underscore (_) and dash (-). But do not start with `http://` or `https://` at the beginning.
     * 
     */
    @Import(name="natIpCidrNames")
    private @Nullable List<String> natIpCidrNames;

    /**
     * @return NAT IP ADDRESS the name of the root directory. Length is from `2` to `128` characters, must start with a letter or the Chinese at the beginning can contain numbers, half a period (.), underscore (_) and dash (-). But do not start with `http://` or `https://` at the beginning.
     * 
     */
    public Optional<List<String>> natIpCidrNames() {
        return Optional.ofNullable(this.natIpCidrNames);
    }

    /**
     * The NAT CIDR block to be created. Support up to `20`. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
     * 
     */
    @Import(name="natIpCidrs")
    private @Nullable List<String> natIpCidrs;

    /**
     * @return The NAT CIDR block to be created. Support up to `20`. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
     * 
     */
    public Optional<List<String>> natIpCidrs() {
        return Optional.ofNullable(this.natIpCidrs);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The status of the CIDR block of the NAT gateway. If the value is `Available`, the CIDR block is available.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the CIDR block of the NAT gateway. If the value is `Available`, the CIDR block is available.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetNatIpCidrsPlainArgs() {}

    private GetNatIpCidrsPlainArgs(GetNatIpCidrsPlainArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.natGatewayId = $.natGatewayId;
        this.natIpCidrNames = $.natIpCidrNames;
        this.natIpCidrs = $.natIpCidrs;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNatIpCidrsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNatIpCidrsPlainArgs $;

        public Builder() {
            $ = new GetNatIpCidrsPlainArgs();
        }

        public Builder(GetNatIpCidrsPlainArgs defaults) {
            $ = new GetNatIpCidrsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Nat Ip Cidr IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Nat Ip Cidr IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Nat Ip Cidr name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param natGatewayId The ID of the VPC NAT gateway.
         * 
         * @return builder
         * 
         */
        public Builder natGatewayId(String natGatewayId) {
            $.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * @param natIpCidrNames NAT IP ADDRESS the name of the root directory. Length is from `2` to `128` characters, must start with a letter or the Chinese at the beginning can contain numbers, half a period (.), underscore (_) and dash (-). But do not start with `http://` or `https://` at the beginning.
         * 
         * @return builder
         * 
         */
        public Builder natIpCidrNames(@Nullable List<String> natIpCidrNames) {
            $.natIpCidrNames = natIpCidrNames;
            return this;
        }

        /**
         * @param natIpCidrNames NAT IP ADDRESS the name of the root directory. Length is from `2` to `128` characters, must start with a letter or the Chinese at the beginning can contain numbers, half a period (.), underscore (_) and dash (-). But do not start with `http://` or `https://` at the beginning.
         * 
         * @return builder
         * 
         */
        public Builder natIpCidrNames(String... natIpCidrNames) {
            return natIpCidrNames(List.of(natIpCidrNames));
        }

        /**
         * @param natIpCidrs The NAT CIDR block to be created. Support up to `20`. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
         * 
         * @return builder
         * 
         */
        public Builder natIpCidrs(@Nullable List<String> natIpCidrs) {
            $.natIpCidrs = natIpCidrs;
            return this;
        }

        /**
         * @param natIpCidrs The NAT CIDR block to be created. Support up to `20`. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
         * 
         * @return builder
         * 
         */
        public Builder natIpCidrs(String... natIpCidrs) {
            return natIpCidrs(List.of(natIpCidrs));
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param status The status of the CIDR block of the NAT gateway. If the value is `Available`, the CIDR block is available.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetNatIpCidrsPlainArgs build() {
            $.natGatewayId = Objects.requireNonNull($.natGatewayId, "expected parameter 'natGatewayId' to be non-null");
            return $;
        }
    }

}
