// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pvtz.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserVpcAuthorizationState extends com.pulumi.resources.ResourceArgs {

    public static final UserVpcAuthorizationState Empty = new UserVpcAuthorizationState();

    /**
     * The auth channel. Valid values: `RESOURCE_DIRECTORY`.
     * 
     */
    @Import(name="authChannel")
    private @Nullable Output<String> authChannel;

    /**
     * @return The auth channel. Valid values: `RESOURCE_DIRECTORY`.
     * 
     */
    public Optional<Output<String>> authChannel() {
        return Optional.ofNullable(this.authChannel);
    }

    /**
     * The type of Authorization. Valid values: `NORMAL` and `CLOUD_PRODUCT`.
     * 
     */
    @Import(name="authType")
    private @Nullable Output<String> authType;

    /**
     * @return The type of Authorization. Valid values: `NORMAL` and `CLOUD_PRODUCT`.
     * 
     */
    public Optional<Output<String>> authType() {
        return Optional.ofNullable(this.authType);
    }

    /**
     * The primary account ID of the user who authorizes the resource.
     * 
     */
    @Import(name="authorizedUserId")
    private @Nullable Output<String> authorizedUserId;

    /**
     * @return The primary account ID of the user who authorizes the resource.
     * 
     */
    public Optional<Output<String>> authorizedUserId() {
        return Optional.ofNullable(this.authorizedUserId);
    }

    private UserVpcAuthorizationState() {}

    private UserVpcAuthorizationState(UserVpcAuthorizationState $) {
        this.authChannel = $.authChannel;
        this.authType = $.authType;
        this.authorizedUserId = $.authorizedUserId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserVpcAuthorizationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserVpcAuthorizationState $;

        public Builder() {
            $ = new UserVpcAuthorizationState();
        }

        public Builder(UserVpcAuthorizationState defaults) {
            $ = new UserVpcAuthorizationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authChannel The auth channel. Valid values: `RESOURCE_DIRECTORY`.
         * 
         * @return builder
         * 
         */
        public Builder authChannel(@Nullable Output<String> authChannel) {
            $.authChannel = authChannel;
            return this;
        }

        /**
         * @param authChannel The auth channel. Valid values: `RESOURCE_DIRECTORY`.
         * 
         * @return builder
         * 
         */
        public Builder authChannel(String authChannel) {
            return authChannel(Output.of(authChannel));
        }

        /**
         * @param authType The type of Authorization. Valid values: `NORMAL` and `CLOUD_PRODUCT`.
         * 
         * @return builder
         * 
         */
        public Builder authType(@Nullable Output<String> authType) {
            $.authType = authType;
            return this;
        }

        /**
         * @param authType The type of Authorization. Valid values: `NORMAL` and `CLOUD_PRODUCT`.
         * 
         * @return builder
         * 
         */
        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        /**
         * @param authorizedUserId The primary account ID of the user who authorizes the resource.
         * 
         * @return builder
         * 
         */
        public Builder authorizedUserId(@Nullable Output<String> authorizedUserId) {
            $.authorizedUserId = authorizedUserId;
            return this;
        }

        /**
         * @param authorizedUserId The primary account ID of the user who authorizes the resource.
         * 
         * @return builder
         * 
         */
        public Builder authorizedUserId(String authorizedUserId) {
            return authorizedUserId(Output.of(authorizedUserId));
        }

        public UserVpcAuthorizationState build() {
            return $;
        }
    }

}
