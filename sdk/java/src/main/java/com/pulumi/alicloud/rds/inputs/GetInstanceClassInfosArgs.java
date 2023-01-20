// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.inputs;

import com.pulumi.alicloud.rds.inputs.GetInstanceClassInfosInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceClassInfosArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceClassInfosArgs Empty = new GetInstanceClassInfosArgs();

    /**
     * The commodity code of the instance. Valid values:
     * * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
     * * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
     * * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
     * * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
     * * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
     * * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
     * * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
     * * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
     * 
     */
    @Import(name="commodityCode", required=true)
    private Output<String> commodityCode;

    /**
     * @return The commodity code of the instance. Valid values:
     * * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
     * * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
     * * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
     * * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
     * * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
     * * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
     * * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
     * * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
     * 
     */
    public Output<String> commodityCode() {
        return this.commodityCode;
    }

    /**
     * The ID of the primary instance.
     * 
     */
    @Import(name="dbInstanceId")
    private @Nullable Output<String> dbInstanceId;

    /**
     * @return The ID of the primary instance.
     * 
     */
    public Optional<Output<String>> dbInstanceId() {
        return Optional.ofNullable(this.dbInstanceId);
    }

    /**
     * A list of Rds available resource. Each element contains the following attributes:
     * 
     */
    @Import(name="infos")
    private @Nullable Output<List<GetInstanceClassInfosInfoArgs>> infos;

    /**
     * @return A list of Rds available resource. Each element contains the following attributes:
     * 
     */
    public Optional<Output<List<GetInstanceClassInfosInfoArgs>>> infos() {
        return Optional.ofNullable(this.infos);
    }

    /**
     * FThe type of order that you want to query. Valid values:
     * * **BUY**: specifies the query orders that are used to purchase instances.
     * * **UPGRADE**: specifies the query orders that are used to change the specifications of instances.
     * * **RENEW**: specifies the query orders that are used to renew instances.
     * * **CONVERT**: specifies the query orders that are used to change the billing methods of instances.
     * 
     */
    @Import(name="orderType", required=true)
    private Output<String> orderType;

    /**
     * @return FThe type of order that you want to query. Valid values:
     * * **BUY**: specifies the query orders that are used to purchase instances.
     * * **UPGRADE**: specifies the query orders that are used to change the specifications of instances.
     * * **RENEW**: specifies the query orders that are used to renew instances.
     * * **CONVERT**: specifies the query orders that are used to change the billing methods of instances.
     * 
     */
    public Output<String> orderType() {
        return this.orderType;
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetInstanceClassInfosArgs() {}

    private GetInstanceClassInfosArgs(GetInstanceClassInfosArgs $) {
        this.commodityCode = $.commodityCode;
        this.dbInstanceId = $.dbInstanceId;
        this.infos = $.infos;
        this.orderType = $.orderType;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceClassInfosArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceClassInfosArgs $;

        public Builder() {
            $ = new GetInstanceClassInfosArgs();
        }

        public Builder(GetInstanceClassInfosArgs defaults) {
            $ = new GetInstanceClassInfosArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commodityCode The commodity code of the instance. Valid values:
         * * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
         * * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
         * * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
         * * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
         * * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
         * * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
         * * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
         * * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
         * 
         * @return builder
         * 
         */
        public Builder commodityCode(Output<String> commodityCode) {
            $.commodityCode = commodityCode;
            return this;
        }

        /**
         * @param commodityCode The commodity code of the instance. Valid values:
         * * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
         * * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
         * * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
         * * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
         * * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
         * * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
         * * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
         * * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
         * 
         * @return builder
         * 
         */
        public Builder commodityCode(String commodityCode) {
            return commodityCode(Output.of(commodityCode));
        }

        /**
         * @param dbInstanceId The ID of the primary instance.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(@Nullable Output<String> dbInstanceId) {
            $.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * @param dbInstanceId The ID of the primary instance.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(String dbInstanceId) {
            return dbInstanceId(Output.of(dbInstanceId));
        }

        /**
         * @param infos A list of Rds available resource. Each element contains the following attributes:
         * 
         * @return builder
         * 
         */
        public Builder infos(@Nullable Output<List<GetInstanceClassInfosInfoArgs>> infos) {
            $.infos = infos;
            return this;
        }

        /**
         * @param infos A list of Rds available resource. Each element contains the following attributes:
         * 
         * @return builder
         * 
         */
        public Builder infos(List<GetInstanceClassInfosInfoArgs> infos) {
            return infos(Output.of(infos));
        }

        /**
         * @param infos A list of Rds available resource. Each element contains the following attributes:
         * 
         * @return builder
         * 
         */
        public Builder infos(GetInstanceClassInfosInfoArgs... infos) {
            return infos(List.of(infos));
        }

        /**
         * @param orderType FThe type of order that you want to query. Valid values:
         * * **BUY**: specifies the query orders that are used to purchase instances.
         * * **UPGRADE**: specifies the query orders that are used to change the specifications of instances.
         * * **RENEW**: specifies the query orders that are used to renew instances.
         * * **CONVERT**: specifies the query orders that are used to change the billing methods of instances.
         * 
         * @return builder
         * 
         */
        public Builder orderType(Output<String> orderType) {
            $.orderType = orderType;
            return this;
        }

        /**
         * @param orderType FThe type of order that you want to query. Valid values:
         * * **BUY**: specifies the query orders that are used to purchase instances.
         * * **UPGRADE**: specifies the query orders that are used to change the specifications of instances.
         * * **RENEW**: specifies the query orders that are used to renew instances.
         * * **CONVERT**: specifies the query orders that are used to change the billing methods of instances.
         * 
         * @return builder
         * 
         */
        public Builder orderType(String orderType) {
            return orderType(Output.of(orderType));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public GetInstanceClassInfosArgs build() {
            $.commodityCode = Objects.requireNonNull($.commodityCode, "expected parameter 'commodityCode' to be non-null");
            $.orderType = Objects.requireNonNull($.orderType, "expected parameter 'orderType' to be non-null");
            return $;
        }
    }

}
