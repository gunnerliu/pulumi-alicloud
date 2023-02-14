// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAssetsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAssetsArgs Empty = new GetAssetsArgs();

    /**
     * Set the conditions for searching assets. This parameter is in JSON format. Note the case when you enter the parameter. **NOTE:** You can search for assets by using conditions such as the instance ID, instance name, VPC ID, region, and public IP address of the asset.
     * 
     */
    @Import(name="criteria")
    private @Nullable Output<String> criteria;

    /**
     * @return Set the conditions for searching assets. This parameter is in JSON format. Note the case when you enter the parameter. **NOTE:** You can search for assets by using conditions such as the instance ID, instance name, VPC ID, region, and public IP address of the asset.
     * 
     */
    public Optional<Output<String>> criteria() {
        return Optional.ofNullable(this.criteria);
    }

    /**
     * A list of Asset IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Asset IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Set asset importance. Value:
     * - **2**: Significant assets
     * - **1**: General assets
     * - **0**: Test asset
     * 
     */
    @Import(name="importance")
    private @Nullable Output<Integer> importance;

    /**
     * @return Set asset importance. Value:
     * - **2**: Significant assets
     * - **1**: General assets
     * - **0**: Test asset
     * 
     */
    public Optional<Output<Integer>> importance() {
        return Optional.ofNullable(this.importance);
    }

    /**
     * Set the logical relationship between multiple search conditions. The default value is **OR**. Valid values:
     * - **OR**: indicates that the relationship between multiple search conditions is **OR**.
     * - **AND**: indicates that the relationship between multiple search conditions is **AND**.
     * 
     */
    @Import(name="logicalExp")
    private @Nullable Output<String> logicalExp;

    /**
     * @return Set the logical relationship between multiple search conditions. The default value is **OR**. Valid values:
     * - **OR**: indicates that the relationship between multiple search conditions is **OR**.
     * - **AND**: indicates that the relationship between multiple search conditions is **AND**.
     * 
     */
    public Optional<Output<String>> logicalExp() {
        return Optional.ofNullable(this.logicalExp);
    }

    /**
     * The type of asset to query. Value:
     * - **ecs**: server.
     * - **cloud_product**: Cloud product.
     * 
     */
    @Import(name="machineTypes")
    private @Nullable Output<String> machineTypes;

    /**
     * @return The type of asset to query. Value:
     * - **ecs**: server.
     * - **cloud_product**: Cloud product.
     * 
     */
    public Optional<Output<String>> machineTypes() {
        return Optional.ofNullable(this.machineTypes);
    }

    /**
     * Specifies whether to internationalize the name of the default group. Default value: false
     * 
     */
    @Import(name="noGroupTrace")
    private @Nullable Output<Boolean> noGroupTrace;

    /**
     * @return Specifies whether to internationalize the name of the default group. Default value: false
     * 
     */
    public Optional<Output<Boolean>> noGroupTrace() {
        return Optional.ofNullable(this.noGroupTrace);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    @Import(name="pageNumber")
    private @Nullable Output<Integer> pageNumber;

    public Optional<Output<Integer>> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Output<Integer> pageSize;

    public Optional<Output<Integer>> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    private GetAssetsArgs() {}

    private GetAssetsArgs(GetAssetsArgs $) {
        this.criteria = $.criteria;
        this.ids = $.ids;
        this.importance = $.importance;
        this.logicalExp = $.logicalExp;
        this.machineTypes = $.machineTypes;
        this.noGroupTrace = $.noGroupTrace;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAssetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAssetsArgs $;

        public Builder() {
            $ = new GetAssetsArgs();
        }

        public Builder(GetAssetsArgs defaults) {
            $ = new GetAssetsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param criteria Set the conditions for searching assets. This parameter is in JSON format. Note the case when you enter the parameter. **NOTE:** You can search for assets by using conditions such as the instance ID, instance name, VPC ID, region, and public IP address of the asset.
         * 
         * @return builder
         * 
         */
        public Builder criteria(@Nullable Output<String> criteria) {
            $.criteria = criteria;
            return this;
        }

        /**
         * @param criteria Set the conditions for searching assets. This parameter is in JSON format. Note the case when you enter the parameter. **NOTE:** You can search for assets by using conditions such as the instance ID, instance name, VPC ID, region, and public IP address of the asset.
         * 
         * @return builder
         * 
         */
        public Builder criteria(String criteria) {
            return criteria(Output.of(criteria));
        }

        /**
         * @param ids A list of Asset IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Asset IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Asset IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param importance Set asset importance. Value:
         * - **2**: Significant assets
         * - **1**: General assets
         * - **0**: Test asset
         * 
         * @return builder
         * 
         */
        public Builder importance(@Nullable Output<Integer> importance) {
            $.importance = importance;
            return this;
        }

        /**
         * @param importance Set asset importance. Value:
         * - **2**: Significant assets
         * - **1**: General assets
         * - **0**: Test asset
         * 
         * @return builder
         * 
         */
        public Builder importance(Integer importance) {
            return importance(Output.of(importance));
        }

        /**
         * @param logicalExp Set the logical relationship between multiple search conditions. The default value is **OR**. Valid values:
         * - **OR**: indicates that the relationship between multiple search conditions is **OR**.
         * - **AND**: indicates that the relationship between multiple search conditions is **AND**.
         * 
         * @return builder
         * 
         */
        public Builder logicalExp(@Nullable Output<String> logicalExp) {
            $.logicalExp = logicalExp;
            return this;
        }

        /**
         * @param logicalExp Set the logical relationship between multiple search conditions. The default value is **OR**. Valid values:
         * - **OR**: indicates that the relationship between multiple search conditions is **OR**.
         * - **AND**: indicates that the relationship between multiple search conditions is **AND**.
         * 
         * @return builder
         * 
         */
        public Builder logicalExp(String logicalExp) {
            return logicalExp(Output.of(logicalExp));
        }

        /**
         * @param machineTypes The type of asset to query. Value:
         * - **ecs**: server.
         * - **cloud_product**: Cloud product.
         * 
         * @return builder
         * 
         */
        public Builder machineTypes(@Nullable Output<String> machineTypes) {
            $.machineTypes = machineTypes;
            return this;
        }

        /**
         * @param machineTypes The type of asset to query. Value:
         * - **ecs**: server.
         * - **cloud_product**: Cloud product.
         * 
         * @return builder
         * 
         */
        public Builder machineTypes(String machineTypes) {
            return machineTypes(Output.of(machineTypes));
        }

        /**
         * @param noGroupTrace Specifies whether to internationalize the name of the default group. Default value: false
         * 
         * @return builder
         * 
         */
        public Builder noGroupTrace(@Nullable Output<Boolean> noGroupTrace) {
            $.noGroupTrace = noGroupTrace;
            return this;
        }

        /**
         * @param noGroupTrace Specifies whether to internationalize the name of the default group. Default value: false
         * 
         * @return builder
         * 
         */
        public Builder noGroupTrace(Boolean noGroupTrace) {
            return noGroupTrace(Output.of(noGroupTrace));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public Builder pageNumber(@Nullable Output<Integer> pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageNumber(Integer pageNumber) {
            return pageNumber(Output.of(pageNumber));
        }

        public Builder pageSize(@Nullable Output<Integer> pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        public Builder pageSize(Integer pageSize) {
            return pageSize(Output.of(pageSize));
        }

        public GetAssetsArgs build() {
            return $;
        }
    }

}