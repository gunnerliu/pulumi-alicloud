// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerState extends com.pulumi.resources.ResourceArgs {

    public static final TriggerState Empty = new TriggerState();

    /**
     * The config of Function Compute trigger.It is valid when `type` is not &#34;mns_topic&#34;.See [Configure triggers and events](https://www.alibabacloud.com/help/doc-detail/70140.htm) for more details.
     * 
     */
    @Import(name="config")
    private @Nullable Output<String> config;

    /**
     * @return The config of Function Compute trigger.It is valid when `type` is not &#34;mns_topic&#34;.See [Configure triggers and events](https://www.alibabacloud.com/help/doc-detail/70140.htm) for more details.
     * 
     */
    public Optional<Output<String>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The config of Function Compute trigger when the type is &#34;mns_topic&#34;.It is conflict with `config`.
     * 
     */
    @Import(name="configMns")
    private @Nullable Output<String> configMns;

    /**
     * @return The config of Function Compute trigger when the type is &#34;mns_topic&#34;.It is conflict with `config`.
     * 
     */
    public Optional<Output<String>> configMns() {
        return Optional.ofNullable(this.configMns);
    }

    /**
     * The Function Compute function name.
     * 
     */
    @Import(name="function")
    private @Nullable Output<String> function;

    /**
     * @return The Function Compute function name.
     * 
     */
    public Optional<Output<String>> function() {
        return Optional.ofNullable(this.function);
    }

    /**
     * The date this resource was last modified.
     * 
     */
    @Import(name="lastModified")
    private @Nullable Output<String> lastModified;

    /**
     * @return The date this resource was last modified.
     * 
     */
    public Optional<Output<String>> lastModified() {
        return Optional.ofNullable(this.lastModified);
    }

    /**
     * The Function Compute trigger name. It is the only in one service and is conflict with &#34;name_prefix&#34;.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Function Compute trigger name. It is the only in one service and is conflict with &#34;name_prefix&#34;.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Setting a prefix to get a only trigger name. It is conflict with &#34;name&#34;.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return Setting a prefix to get a only trigger name. It is conflict with &#34;name&#34;.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * RAM role arn attached to the Function Compute trigger. Role used by the event source to call the function. The value format is &#34;acs:ram::$account-id:role/$role-name&#34;. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return RAM role arn attached to the Function Compute trigger. Role used by the event source to call the function. The value format is &#34;acs:ram::$account-id:role/$role-name&#34;. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * The Function Compute service name.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The Function Compute service name.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * Event source resource address. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
     * 
     */
    @Import(name="sourceArn")
    private @Nullable Output<String> sourceArn;

    /**
     * @return Event source resource address. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
     * 
     */
    public Optional<Output<String>> sourceArn() {
        return Optional.ofNullable(this.sourceArn);
    }

    /**
     * The Function Compute trigger ID.
     * 
     */
    @Import(name="triggerId")
    private @Nullable Output<String> triggerId;

    /**
     * @return The Function Compute trigger ID.
     * 
     */
    public Optional<Output<String>> triggerId() {
        return Optional.ofNullable(this.triggerId);
    }

    /**
     * The Type of the trigger. Valid values: [&#34;oss&#34;, &#34;log&#34;, &#34;timer&#34;, &#34;http&#34;, &#34;mns_topic&#34;, &#34;cdn_events&#34;, &#34;eventbridge&#34;].
     * 
     * &gt; **NOTE:** Config does not support modification when type is mns_topic.
     * **NOTE:** type = cdn_events, available in 1.47.0+.
     * **NOTE:** type = eventbridge, available in 1.173.0+.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The Type of the trigger. Valid values: [&#34;oss&#34;, &#34;log&#34;, &#34;timer&#34;, &#34;http&#34;, &#34;mns_topic&#34;, &#34;cdn_events&#34;, &#34;eventbridge&#34;].
     * 
     * &gt; **NOTE:** Config does not support modification when type is mns_topic.
     * **NOTE:** type = cdn_events, available in 1.47.0+.
     * **NOTE:** type = eventbridge, available in 1.173.0+.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private TriggerState() {}

    private TriggerState(TriggerState $) {
        this.config = $.config;
        this.configMns = $.configMns;
        this.function = $.function;
        this.lastModified = $.lastModified;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.role = $.role;
        this.service = $.service;
        this.sourceArn = $.sourceArn;
        this.triggerId = $.triggerId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerState $;

        public Builder() {
            $ = new TriggerState();
        }

        public Builder(TriggerState defaults) {
            $ = new TriggerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param config The config of Function Compute trigger.It is valid when `type` is not &#34;mns_topic&#34;.See [Configure triggers and events](https://www.alibabacloud.com/help/doc-detail/70140.htm) for more details.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<String> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The config of Function Compute trigger.It is valid when `type` is not &#34;mns_topic&#34;.See [Configure triggers and events](https://www.alibabacloud.com/help/doc-detail/70140.htm) for more details.
         * 
         * @return builder
         * 
         */
        public Builder config(String config) {
            return config(Output.of(config));
        }

        /**
         * @param configMns The config of Function Compute trigger when the type is &#34;mns_topic&#34;.It is conflict with `config`.
         * 
         * @return builder
         * 
         */
        public Builder configMns(@Nullable Output<String> configMns) {
            $.configMns = configMns;
            return this;
        }

        /**
         * @param configMns The config of Function Compute trigger when the type is &#34;mns_topic&#34;.It is conflict with `config`.
         * 
         * @return builder
         * 
         */
        public Builder configMns(String configMns) {
            return configMns(Output.of(configMns));
        }

        /**
         * @param function The Function Compute function name.
         * 
         * @return builder
         * 
         */
        public Builder function(@Nullable Output<String> function) {
            $.function = function;
            return this;
        }

        /**
         * @param function The Function Compute function name.
         * 
         * @return builder
         * 
         */
        public Builder function(String function) {
            return function(Output.of(function));
        }

        /**
         * @param lastModified The date this resource was last modified.
         * 
         * @return builder
         * 
         */
        public Builder lastModified(@Nullable Output<String> lastModified) {
            $.lastModified = lastModified;
            return this;
        }

        /**
         * @param lastModified The date this resource was last modified.
         * 
         * @return builder
         * 
         */
        public Builder lastModified(String lastModified) {
            return lastModified(Output.of(lastModified));
        }

        /**
         * @param name The Function Compute trigger name. It is the only in one service and is conflict with &#34;name_prefix&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Function Compute trigger name. It is the only in one service and is conflict with &#34;name_prefix&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix Setting a prefix to get a only trigger name. It is conflict with &#34;name&#34;.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix Setting a prefix to get a only trigger name. It is conflict with &#34;name&#34;.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param role RAM role arn attached to the Function Compute trigger. Role used by the event source to call the function. The value format is &#34;acs:ram::$account-id:role/$role-name&#34;. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role RAM role arn attached to the Function Compute trigger. Role used by the event source to call the function. The value format is &#34;acs:ram::$account-id:role/$role-name&#34;. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param service The Function Compute service name.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The Function Compute service name.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param sourceArn Event source resource address. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
         * 
         * @return builder
         * 
         */
        public Builder sourceArn(@Nullable Output<String> sourceArn) {
            $.sourceArn = sourceArn;
            return this;
        }

        /**
         * @param sourceArn Event source resource address. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
         * 
         * @return builder
         * 
         */
        public Builder sourceArn(String sourceArn) {
            return sourceArn(Output.of(sourceArn));
        }

        /**
         * @param triggerId The Function Compute trigger ID.
         * 
         * @return builder
         * 
         */
        public Builder triggerId(@Nullable Output<String> triggerId) {
            $.triggerId = triggerId;
            return this;
        }

        /**
         * @param triggerId The Function Compute trigger ID.
         * 
         * @return builder
         * 
         */
        public Builder triggerId(String triggerId) {
            return triggerId(Output.of(triggerId));
        }

        /**
         * @param type The Type of the trigger. Valid values: [&#34;oss&#34;, &#34;log&#34;, &#34;timer&#34;, &#34;http&#34;, &#34;mns_topic&#34;, &#34;cdn_events&#34;, &#34;eventbridge&#34;].
         * 
         * &gt; **NOTE:** Config does not support modification when type is mns_topic.
         * **NOTE:** type = cdn_events, available in 1.47.0+.
         * **NOTE:** type = eventbridge, available in 1.173.0+.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The Type of the trigger. Valid values: [&#34;oss&#34;, &#34;log&#34;, &#34;timer&#34;, &#34;http&#34;, &#34;mns_topic&#34;, &#34;cdn_events&#34;, &#34;eventbridge&#34;].
         * 
         * &gt; **NOTE:** Config does not support modification when type is mns_topic.
         * **NOTE:** type = cdn_events, available in 1.47.0+.
         * **NOTE:** type = eventbridge, available in 1.173.0+.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public TriggerState build() {
            return $;
        }
    }

}
