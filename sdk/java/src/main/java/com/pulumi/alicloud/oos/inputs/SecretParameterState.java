// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oos.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretParameterState extends com.pulumi.resources.ResourceArgs {

    public static final SecretParameterState Empty = new SecretParameterState();

    /**
     * The constraints of the encryption parameter. By default, this parameter is null. Valid values:
     * * `AllowedValues`: The value that is allowed for the encryption parameter. It must be an array string.
     * * `AllowedPattern`: The pattern that is allowed for the encryption parameter. It must be a regular expression.
     * * `MinLength`: The minimum length of the encryption parameter.
     * * `MaxLength`: The maximum length of the encryption parameter.
     * 
     */
    @Import(name="constraints")
    private @Nullable Output<String> constraints;

    /**
     * @return The constraints of the encryption parameter. By default, this parameter is null. Valid values:
     * * `AllowedValues`: The value that is allowed for the encryption parameter. It must be an array string.
     * * `AllowedPattern`: The pattern that is allowed for the encryption parameter. It must be a regular expression.
     * * `MinLength`: The minimum length of the encryption parameter.
     * * `MaxLength`: The maximum length of the encryption parameter.
     * 
     */
    public Optional<Output<String>> constraints() {
        return Optional.ofNullable(this.constraints);
    }

    /**
     * The description of the encryption parameter. The description must be `1` to `200` characters in length.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the encryption parameter. The description must be `1` to `200` characters in length.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Customer Master Key (CMK) of Key Management Service (KMS) that is used to encrypt the parameter.
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    /**
     * @return The Customer Master Key (CMK) of Key Management Service (KMS) that is used to encrypt the parameter.
     * 
     */
    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    /**
     * The ID of the Resource Group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the Resource Group.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The name of the encryption parameter.  The name must be `2` to `180` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/) and underscores (_). It cannot start with `ALIYUN`, `ACS`, `ALIBABA`, `ALICLOUD`, or `OOS`.
     * 
     */
    @Import(name="secretParameterName")
    private @Nullable Output<String> secretParameterName;

    /**
     * @return The name of the encryption parameter.  The name must be `2` to `180` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/) and underscores (_). It cannot start with `ALIYUN`, `ACS`, `ALIBABA`, `ALICLOUD`, or `OOS`.
     * 
     */
    public Optional<Output<String>> secretParameterName() {
        return Optional.ofNullable(this.secretParameterName);
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

    /**
     * The data type of the encryption parameter. Valid values: `Secret`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The data type of the encryption parameter. Valid values: `Secret`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The value of the encryption parameter. The value must be `1` to `4096` characters in length.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the encryption parameter. The value must be `1` to `4096` characters in length.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private SecretParameterState() {}

    private SecretParameterState(SecretParameterState $) {
        this.constraints = $.constraints;
        this.description = $.description;
        this.keyId = $.keyId;
        this.resourceGroupId = $.resourceGroupId;
        this.secretParameterName = $.secretParameterName;
        this.tags = $.tags;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretParameterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretParameterState $;

        public Builder() {
            $ = new SecretParameterState();
        }

        public Builder(SecretParameterState defaults) {
            $ = new SecretParameterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param constraints The constraints of the encryption parameter. By default, this parameter is null. Valid values:
         * * `AllowedValues`: The value that is allowed for the encryption parameter. It must be an array string.
         * * `AllowedPattern`: The pattern that is allowed for the encryption parameter. It must be a regular expression.
         * * `MinLength`: The minimum length of the encryption parameter.
         * * `MaxLength`: The maximum length of the encryption parameter.
         * 
         * @return builder
         * 
         */
        public Builder constraints(@Nullable Output<String> constraints) {
            $.constraints = constraints;
            return this;
        }

        /**
         * @param constraints The constraints of the encryption parameter. By default, this parameter is null. Valid values:
         * * `AllowedValues`: The value that is allowed for the encryption parameter. It must be an array string.
         * * `AllowedPattern`: The pattern that is allowed for the encryption parameter. It must be a regular expression.
         * * `MinLength`: The minimum length of the encryption parameter.
         * * `MaxLength`: The maximum length of the encryption parameter.
         * 
         * @return builder
         * 
         */
        public Builder constraints(String constraints) {
            return constraints(Output.of(constraints));
        }

        /**
         * @param description The description of the encryption parameter. The description must be `1` to `200` characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the encryption parameter. The description must be `1` to `200` characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param keyId The Customer Master Key (CMK) of Key Management Service (KMS) that is used to encrypt the parameter.
         * 
         * @return builder
         * 
         */
        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId The Customer Master Key (CMK) of Key Management Service (KMS) that is used to encrypt the parameter.
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        /**
         * @param resourceGroupId The ID of the Resource Group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the Resource Group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param secretParameterName The name of the encryption parameter.  The name must be `2` to `180` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/) and underscores (_). It cannot start with `ALIYUN`, `ACS`, `ALIBABA`, `ALICLOUD`, or `OOS`.
         * 
         * @return builder
         * 
         */
        public Builder secretParameterName(@Nullable Output<String> secretParameterName) {
            $.secretParameterName = secretParameterName;
            return this;
        }

        /**
         * @param secretParameterName The name of the encryption parameter.  The name must be `2` to `180` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/) and underscores (_). It cannot start with `ALIYUN`, `ACS`, `ALIBABA`, `ALICLOUD`, or `OOS`.
         * 
         * @return builder
         * 
         */
        public Builder secretParameterName(String secretParameterName) {
            return secretParameterName(Output.of(secretParameterName));
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

        /**
         * @param type The data type of the encryption parameter. Valid values: `Secret`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The data type of the encryption parameter. Valid values: `Secret`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The value of the encryption parameter. The value must be `1` to `4096` characters in length.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the encryption parameter. The value must be `1` to `4096` characters in length.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SecretParameterState build() {
            return $;
        }
    }

}
