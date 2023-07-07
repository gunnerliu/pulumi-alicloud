// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.inputs;

import com.pulumi.alicloud.rds.inputs.RdsParameterGroupParamDetailArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RdsParameterGroupState extends com.pulumi.resources.ResourceArgs {

    public static final RdsParameterGroupState Empty = new RdsParameterGroupState();

    /**
     * The database engine. Valid values: `mysql`, `mariadb`, `PostgreSQL`.
     * 
     */
    @Import(name="engine")
    private @Nullable Output<String> engine;

    /**
     * @return The database engine. Valid values: `mysql`, `mariadb`, `PostgreSQL`.
     * 
     */
    public Optional<Output<String>> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * The version of the database engine. Valid values: mysql: `5.1`, `5.5`, `5.6`, `5.7`, `8.0`; mariadb: `10.3`; PostgreSQL: `10.0`, `11.0`, `12.0`, `13.0`, `14.0`, `15.0`.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable Output<String> engineVersion;

    /**
     * @return The version of the database engine. Valid values: mysql: `5.1`, `5.5`, `5.6`, `5.7`, `8.0`; mariadb: `10.3`; PostgreSQL: `10.0`, `11.0`, `12.0`, `13.0`, `14.0`, `15.0`.
     * 
     */
    public Optional<Output<String>> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * Parameter list. See `param_detail` below.
     * 
     */
    @Import(name="paramDetails")
    private @Nullable Output<List<RdsParameterGroupParamDetailArgs>> paramDetails;

    /**
     * @return Parameter list. See `param_detail` below.
     * 
     */
    public Optional<Output<List<RdsParameterGroupParamDetailArgs>>> paramDetails() {
        return Optional.ofNullable(this.paramDetails);
    }

    /**
     * The description of the parameter template.
     * 
     */
    @Import(name="parameterGroupDesc")
    private @Nullable Output<String> parameterGroupDesc;

    /**
     * @return The description of the parameter template.
     * 
     */
    public Optional<Output<String>> parameterGroupDesc() {
        return Optional.ofNullable(this.parameterGroupDesc);
    }

    /**
     * The name of the parameter template.
     * 
     */
    @Import(name="parameterGroupName")
    private @Nullable Output<String> parameterGroupName;

    /**
     * @return The name of the parameter template.
     * 
     */
    public Optional<Output<String>> parameterGroupName() {
        return Optional.ofNullable(this.parameterGroupName);
    }

    private RdsParameterGroupState() {}

    private RdsParameterGroupState(RdsParameterGroupState $) {
        this.engine = $.engine;
        this.engineVersion = $.engineVersion;
        this.paramDetails = $.paramDetails;
        this.parameterGroupDesc = $.parameterGroupDesc;
        this.parameterGroupName = $.parameterGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RdsParameterGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RdsParameterGroupState $;

        public Builder() {
            $ = new RdsParameterGroupState();
        }

        public Builder(RdsParameterGroupState defaults) {
            $ = new RdsParameterGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param engine The database engine. Valid values: `mysql`, `mariadb`, `PostgreSQL`.
         * 
         * @return builder
         * 
         */
        public Builder engine(@Nullable Output<String> engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engine The database engine. Valid values: `mysql`, `mariadb`, `PostgreSQL`.
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        /**
         * @param engineVersion The version of the database engine. Valid values: mysql: `5.1`, `5.5`, `5.6`, `5.7`, `8.0`; mariadb: `10.3`; PostgreSQL: `10.0`, `11.0`, `12.0`, `13.0`, `14.0`, `15.0`.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        /**
         * @param engineVersion The version of the database engine. Valid values: mysql: `5.1`, `5.5`, `5.6`, `5.7`, `8.0`; mariadb: `10.3`; PostgreSQL: `10.0`, `11.0`, `12.0`, `13.0`, `14.0`, `15.0`.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(String engineVersion) {
            return engineVersion(Output.of(engineVersion));
        }

        /**
         * @param paramDetails Parameter list. See `param_detail` below.
         * 
         * @return builder
         * 
         */
        public Builder paramDetails(@Nullable Output<List<RdsParameterGroupParamDetailArgs>> paramDetails) {
            $.paramDetails = paramDetails;
            return this;
        }

        /**
         * @param paramDetails Parameter list. See `param_detail` below.
         * 
         * @return builder
         * 
         */
        public Builder paramDetails(List<RdsParameterGroupParamDetailArgs> paramDetails) {
            return paramDetails(Output.of(paramDetails));
        }

        /**
         * @param paramDetails Parameter list. See `param_detail` below.
         * 
         * @return builder
         * 
         */
        public Builder paramDetails(RdsParameterGroupParamDetailArgs... paramDetails) {
            return paramDetails(List.of(paramDetails));
        }

        /**
         * @param parameterGroupDesc The description of the parameter template.
         * 
         * @return builder
         * 
         */
        public Builder parameterGroupDesc(@Nullable Output<String> parameterGroupDesc) {
            $.parameterGroupDesc = parameterGroupDesc;
            return this;
        }

        /**
         * @param parameterGroupDesc The description of the parameter template.
         * 
         * @return builder
         * 
         */
        public Builder parameterGroupDesc(String parameterGroupDesc) {
            return parameterGroupDesc(Output.of(parameterGroupDesc));
        }

        /**
         * @param parameterGroupName The name of the parameter template.
         * 
         * @return builder
         * 
         */
        public Builder parameterGroupName(@Nullable Output<String> parameterGroupName) {
            $.parameterGroupName = parameterGroupName;
            return this;
        }

        /**
         * @param parameterGroupName The name of the parameter template.
         * 
         * @return builder
         * 
         */
        public Builder parameterGroupName(String parameterGroupName) {
            return parameterGroupName(Output.of(parameterGroupName));
        }

        public RdsParameterGroupState build() {
            return $;
        }
    }

}
