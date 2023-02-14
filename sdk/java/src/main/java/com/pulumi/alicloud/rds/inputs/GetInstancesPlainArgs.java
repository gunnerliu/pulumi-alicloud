// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstancesPlainArgs Empty = new GetInstancesPlainArgs();

    /**
     * `Standard` for standard access mode and `Safe` for high security access mode.
     * 
     */
    @Import(name="connectionMode")
    private @Nullable String connectionMode;

    /**
     * @return `Standard` for standard access mode and `Safe` for high security access mode.
     * 
     */
    public Optional<String> connectionMode() {
        return Optional.ofNullable(this.connectionMode);
    }

    /**
     * `Primary` for primary instance, `Readonly` for read-only instance, `Guard` for disaster recovery instance, and `Temp` for temporary instance.
     * 
     */
    @Import(name="dbType")
    private @Nullable String dbType;

    /**
     * @return `Primary` for primary instance, `Readonly` for read-only instance, `Guard` for disaster recovery instance, and `Temp` for temporary instance.
     * 
     */
    public Optional<String> dbType() {
        return Optional.ofNullable(this.dbType);
    }

    /**
     * Default to `false`. Set it to `true` can output parameter template about resource attributes.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    /**
     * @return Default to `false`. Set it to `true` can output parameter template about resource attributes.
     * 
     */
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * Database type. Options are `MySQL`, `SQLServer`, `PostgreSQL` and `PPAS`. If no value is specified, all types are returned.
     * 
     */
    @Import(name="engine")
    private @Nullable String engine;

    /**
     * @return Database type. Options are `MySQL`, `SQLServer`, `PostgreSQL` and `PPAS`. If no value is specified, all types are returned.
     * 
     */
    public Optional<String> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * A list of RDS instance IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of RDS instance IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by instance name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by instance name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    @Import(name="pageNumber")
    private @Nullable Integer pageNumber;

    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Integer pageSize;

    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    /**
     * Status of the instance.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return Status of the instance.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A map of tags assigned to the DB instances.
     * Note: Before 1.60.0, the value&#39;s format is a `json` string which including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `&#34;{\&#34;key1\&#34;:\&#34;value1\&#34;}&#34;`
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,Object> tags;

    /**
     * @return A map of tags assigned to the DB instances.
     * Note: Before 1.60.0, the value&#39;s format is a `json` string which including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `&#34;{\&#34;key1\&#34;:\&#34;value1\&#34;}&#34;`
     * 
     */
    public Optional<Map<String,Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Used to retrieve instances belong to specified VPC.
     * 
     */
    @Import(name="vpcId")
    private @Nullable String vpcId;

    /**
     * @return Used to retrieve instances belong to specified VPC.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * Used to retrieve instances belong to specified `vswitch` resources.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable String vswitchId;

    /**
     * @return Used to retrieve instances belong to specified `vswitch` resources.
     * 
     */
    public Optional<String> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private GetInstancesPlainArgs() {}

    private GetInstancesPlainArgs(GetInstancesPlainArgs $) {
        this.connectionMode = $.connectionMode;
        this.dbType = $.dbType;
        this.enableDetails = $.enableDetails;
        this.engine = $.engine;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.status = $.status;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstancesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstancesPlainArgs $;

        public Builder() {
            $ = new GetInstancesPlainArgs();
        }

        public Builder(GetInstancesPlainArgs defaults) {
            $ = new GetInstancesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionMode `Standard` for standard access mode and `Safe` for high security access mode.
         * 
         * @return builder
         * 
         */
        public Builder connectionMode(@Nullable String connectionMode) {
            $.connectionMode = connectionMode;
            return this;
        }

        /**
         * @param dbType `Primary` for primary instance, `Readonly` for read-only instance, `Guard` for disaster recovery instance, and `Temp` for temporary instance.
         * 
         * @return builder
         * 
         */
        public Builder dbType(@Nullable String dbType) {
            $.dbType = dbType;
            return this;
        }

        /**
         * @param enableDetails Default to `false`. Set it to `true` can output parameter template about resource attributes.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param engine Database type. Options are `MySQL`, `SQLServer`, `PostgreSQL` and `PPAS`. If no value is specified, all types are returned.
         * 
         * @return builder
         * 
         */
        public Builder engine(@Nullable String engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param ids A list of RDS instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of RDS instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by instance name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder pageNumber(@Nullable Integer pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageSize(@Nullable Integer pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        /**
         * @param status Status of the instance.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param tags A map of tags assigned to the DB instances.
         * Note: Before 1.60.0, the value&#39;s format is a `json` string which including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `&#34;{\&#34;key1\&#34;:\&#34;value1\&#34;}&#34;`
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,Object> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param vpcId Used to retrieve instances belong to specified VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable String vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vswitchId Used to retrieve instances belong to specified `vswitch` resources.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable String vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        public GetInstancesPlainArgs build() {
            return $;
        }
    }

}