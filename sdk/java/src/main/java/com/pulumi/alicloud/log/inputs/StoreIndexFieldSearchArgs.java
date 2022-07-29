// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.inputs;

import com.pulumi.alicloud.log.inputs.StoreIndexFieldSearchJsonKeyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StoreIndexFieldSearchArgs extends com.pulumi.resources.ResourceArgs {

    public static final StoreIndexFieldSearchArgs Empty = new StoreIndexFieldSearchArgs();

    /**
     * The alias of one field.
     * 
     */
    @Import(name="alias")
    private @Nullable Output<String> alias;

    /**
     * @return The alias of one field.
     * 
     */
    public Optional<Output<String>> alias() {
        return Optional.ofNullable(this.alias);
    }

    /**
     * Whether the case sensitive for the field. Default to false. It is valid when &#34;type&#34; is &#34;text&#34; or &#34;json&#34;.
     * 
     */
    @Import(name="caseSensitive")
    private @Nullable Output<Boolean> caseSensitive;

    /**
     * @return Whether the case sensitive for the field. Default to false. It is valid when &#34;type&#34; is &#34;text&#34; or &#34;json&#34;.
     * 
     */
    public Optional<Output<Boolean>> caseSensitive() {
        return Optional.ofNullable(this.caseSensitive);
    }

    /**
     * Whether to enable field analytics. Default to true.
     * 
     */
    @Import(name="enableAnalytics")
    private @Nullable Output<Boolean> enableAnalytics;

    /**
     * @return Whether to enable field analytics. Default to true.
     * 
     */
    public Optional<Output<Boolean>> enableAnalytics() {
        return Optional.ofNullable(this.enableAnalytics);
    }

    /**
     * Whether includes the chinese for the field. Default to false. It is valid when &#34;type&#34; is &#34;text&#34; or &#34;json&#34;.
     * 
     */
    @Import(name="includeChinese")
    private @Nullable Output<Boolean> includeChinese;

    /**
     * @return Whether includes the chinese for the field. Default to false. It is valid when &#34;type&#34; is &#34;text&#34; or &#34;json&#34;.
     * 
     */
    public Optional<Output<Boolean>> includeChinese() {
        return Optional.ofNullable(this.includeChinese);
    }

    /**
     * Use nested index when type is json
     * 
     */
    @Import(name="jsonKeys")
    private @Nullable Output<List<StoreIndexFieldSearchJsonKeyArgs>> jsonKeys;

    /**
     * @return Use nested index when type is json
     * 
     */
    public Optional<Output<List<StoreIndexFieldSearchJsonKeyArgs>>> jsonKeys() {
        return Optional.ofNullable(this.jsonKeys);
    }

    /**
     * When using the json_keys field, this field is required.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return When using the json_keys field, this field is required.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The string of several split words, like &#34;\r&#34;, &#34;#&#34;. It is valid when &#34;type&#34; is &#34;text&#34; or &#34;json&#34;.
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return The string of several split words, like &#34;\r&#34;, &#34;#&#34;. It is valid when &#34;type&#34; is &#34;text&#34; or &#34;json&#34;.
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    /**
     * The type of one field. Valid values: [&#34;long&#34;, &#34;text&#34;, &#34;double&#34;]. Default to &#34;long&#34;
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of one field. Valid values: [&#34;long&#34;, &#34;text&#34;, &#34;double&#34;]. Default to &#34;long&#34;
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private StoreIndexFieldSearchArgs() {}

    private StoreIndexFieldSearchArgs(StoreIndexFieldSearchArgs $) {
        this.alias = $.alias;
        this.caseSensitive = $.caseSensitive;
        this.enableAnalytics = $.enableAnalytics;
        this.includeChinese = $.includeChinese;
        this.jsonKeys = $.jsonKeys;
        this.name = $.name;
        this.token = $.token;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StoreIndexFieldSearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StoreIndexFieldSearchArgs $;

        public Builder() {
            $ = new StoreIndexFieldSearchArgs();
        }

        public Builder(StoreIndexFieldSearchArgs defaults) {
            $ = new StoreIndexFieldSearchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alias The alias of one field.
         * 
         * @return builder
         * 
         */
        public Builder alias(@Nullable Output<String> alias) {
            $.alias = alias;
            return this;
        }

        /**
         * @param alias The alias of one field.
         * 
         * @return builder
         * 
         */
        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        /**
         * @param caseSensitive Whether the case sensitive for the field. Default to false. It is valid when &#34;type&#34; is &#34;text&#34; or &#34;json&#34;.
         * 
         * @return builder
         * 
         */
        public Builder caseSensitive(@Nullable Output<Boolean> caseSensitive) {
            $.caseSensitive = caseSensitive;
            return this;
        }

        /**
         * @param caseSensitive Whether the case sensitive for the field. Default to false. It is valid when &#34;type&#34; is &#34;text&#34; or &#34;json&#34;.
         * 
         * @return builder
         * 
         */
        public Builder caseSensitive(Boolean caseSensitive) {
            return caseSensitive(Output.of(caseSensitive));
        }

        /**
         * @param enableAnalytics Whether to enable field analytics. Default to true.
         * 
         * @return builder
         * 
         */
        public Builder enableAnalytics(@Nullable Output<Boolean> enableAnalytics) {
            $.enableAnalytics = enableAnalytics;
            return this;
        }

        /**
         * @param enableAnalytics Whether to enable field analytics. Default to true.
         * 
         * @return builder
         * 
         */
        public Builder enableAnalytics(Boolean enableAnalytics) {
            return enableAnalytics(Output.of(enableAnalytics));
        }

        /**
         * @param includeChinese Whether includes the chinese for the field. Default to false. It is valid when &#34;type&#34; is &#34;text&#34; or &#34;json&#34;.
         * 
         * @return builder
         * 
         */
        public Builder includeChinese(@Nullable Output<Boolean> includeChinese) {
            $.includeChinese = includeChinese;
            return this;
        }

        /**
         * @param includeChinese Whether includes the chinese for the field. Default to false. It is valid when &#34;type&#34; is &#34;text&#34; or &#34;json&#34;.
         * 
         * @return builder
         * 
         */
        public Builder includeChinese(Boolean includeChinese) {
            return includeChinese(Output.of(includeChinese));
        }

        /**
         * @param jsonKeys Use nested index when type is json
         * 
         * @return builder
         * 
         */
        public Builder jsonKeys(@Nullable Output<List<StoreIndexFieldSearchJsonKeyArgs>> jsonKeys) {
            $.jsonKeys = jsonKeys;
            return this;
        }

        /**
         * @param jsonKeys Use nested index when type is json
         * 
         * @return builder
         * 
         */
        public Builder jsonKeys(List<StoreIndexFieldSearchJsonKeyArgs> jsonKeys) {
            return jsonKeys(Output.of(jsonKeys));
        }

        /**
         * @param jsonKeys Use nested index when type is json
         * 
         * @return builder
         * 
         */
        public Builder jsonKeys(StoreIndexFieldSearchJsonKeyArgs... jsonKeys) {
            return jsonKeys(List.of(jsonKeys));
        }

        /**
         * @param name When using the json_keys field, this field is required.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name When using the json_keys field, this field is required.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param token The string of several split words, like &#34;\r&#34;, &#34;#&#34;. It is valid when &#34;type&#34; is &#34;text&#34; or &#34;json&#34;.
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token The string of several split words, like &#34;\r&#34;, &#34;#&#34;. It is valid when &#34;type&#34; is &#34;text&#34; or &#34;json&#34;.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        /**
         * @param type The type of one field. Valid values: [&#34;long&#34;, &#34;text&#34;, &#34;double&#34;]. Default to &#34;long&#34;
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of one field. Valid values: [&#34;long&#34;, &#34;text&#34;, &#34;double&#34;]. Default to &#34;long&#34;
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public StoreIndexFieldSearchArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
