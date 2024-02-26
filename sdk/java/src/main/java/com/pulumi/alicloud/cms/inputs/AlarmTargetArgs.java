// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlarmTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlarmTargetArgs Empty = new AlarmTargetArgs();

    /**
     * The Alibaba Cloud Resource Name (ARN) of the resource.
     * &gt; **NOTE:** Currently, the Alibaba Cloud Resource Name (ARN) of the resource. To use, please [submit an application](https://www.alibabacloud.com/help/en/cloudmonitor/latest/describemetricruletargets).
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Alibaba Cloud Resource Name (ARN) of the resource.
     * &gt; **NOTE:** Currently, the Alibaba Cloud Resource Name (ARN) of the resource. To use, please [submit an application](https://www.alibabacloud.com/help/en/cloudmonitor/latest/describemetricruletargets).
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The parameters of the alert callback. The parameters are in the JSON format.
     * 
     */
    @Import(name="jsonParams")
    private @Nullable Output<String> jsonParams;

    /**
     * @return The parameters of the alert callback. The parameters are in the JSON format.
     * 
     */
    public Optional<Output<String>> jsonParams() {
        return Optional.ofNullable(this.jsonParams);
    }

    /**
     * The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
     * 
     */
    @Import(name="level")
    private @Nullable Output<String> level;

    /**
     * @return The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
     * 
     */
    public Optional<Output<String>> level() {
        return Optional.ofNullable(this.level);
    }

    /**
     * The ID of the resource for which alerts are triggered.
     * 
     */
    @Import(name="targetId")
    private @Nullable Output<String> targetId;

    /**
     * @return The ID of the resource for which alerts are triggered.
     * 
     */
    public Optional<Output<String>> targetId() {
        return Optional.ofNullable(this.targetId);
    }

    private AlarmTargetArgs() {}

    private AlarmTargetArgs(AlarmTargetArgs $) {
        this.arn = $.arn;
        this.jsonParams = $.jsonParams;
        this.level = $.level;
        this.targetId = $.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlarmTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlarmTargetArgs $;

        public Builder() {
            $ = new AlarmTargetArgs();
        }

        public Builder(AlarmTargetArgs defaults) {
            $ = new AlarmTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Alibaba Cloud Resource Name (ARN) of the resource.
         * &gt; **NOTE:** Currently, the Alibaba Cloud Resource Name (ARN) of the resource. To use, please [submit an application](https://www.alibabacloud.com/help/en/cloudmonitor/latest/describemetricruletargets).
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Alibaba Cloud Resource Name (ARN) of the resource.
         * &gt; **NOTE:** Currently, the Alibaba Cloud Resource Name (ARN) of the resource. To use, please [submit an application](https://www.alibabacloud.com/help/en/cloudmonitor/latest/describemetricruletargets).
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param jsonParams The parameters of the alert callback. The parameters are in the JSON format.
         * 
         * @return builder
         * 
         */
        public Builder jsonParams(@Nullable Output<String> jsonParams) {
            $.jsonParams = jsonParams;
            return this;
        }

        /**
         * @param jsonParams The parameters of the alert callback. The parameters are in the JSON format.
         * 
         * @return builder
         * 
         */
        public Builder jsonParams(String jsonParams) {
            return jsonParams(Output.of(jsonParams));
        }

        /**
         * @param level The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
         * 
         * @return builder
         * 
         */
        public Builder level(@Nullable Output<String> level) {
            $.level = level;
            return this;
        }

        /**
         * @param level The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
         * 
         * @return builder
         * 
         */
        public Builder level(String level) {
            return level(Output.of(level));
        }

        /**
         * @param targetId The ID of the resource for which alerts are triggered.
         * 
         * @return builder
         * 
         */
        public Builder targetId(@Nullable Output<String> targetId) {
            $.targetId = targetId;
            return this;
        }

        /**
         * @param targetId The ID of the resource for which alerts are triggered.
         * 
         * @return builder
         * 
         */
        public Builder targetId(String targetId) {
            return targetId(Output.of(targetId));
        }

        public AlarmTargetArgs build() {
            return $;
        }
    }

}