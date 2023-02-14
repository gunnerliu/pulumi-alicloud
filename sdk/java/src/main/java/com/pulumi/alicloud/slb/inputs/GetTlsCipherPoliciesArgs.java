// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTlsCipherPoliciesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTlsCipherPoliciesArgs Empty = new GetTlsCipherPoliciesArgs();

    /**
     * A list of Tls Cipher Policy IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Tls Cipher Policy IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The include listener.
     * 
     */
    @Import(name="includeListener")
    private @Nullable Output<Boolean> includeListener;

    /**
     * @return The include listener.
     * 
     */
    public Optional<Output<Boolean>> includeListener() {
        return Optional.ofNullable(this.includeListener);
    }

    /**
     * A regex string to filter results by Tls Cipher Policy name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Tls Cipher Policy name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * TLS policy instance state.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return TLS policy instance state.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * TLS policy name. Length is from 2 to 128, or in both the English and Chinese characters must be with an uppercase/lowercase letter or a Chinese character and the beginning, may contain numbers, in dot `.`, underscore `_` or dash `-`.
     * 
     */
    @Import(name="tlsCipherPolicyName")
    private @Nullable Output<String> tlsCipherPolicyName;

    /**
     * @return TLS policy name. Length is from 2 to 128, or in both the English and Chinese characters must be with an uppercase/lowercase letter or a Chinese character and the beginning, may contain numbers, in dot `.`, underscore `_` or dash `-`.
     * 
     */
    public Optional<Output<String>> tlsCipherPolicyName() {
        return Optional.ofNullable(this.tlsCipherPolicyName);
    }

    private GetTlsCipherPoliciesArgs() {}

    private GetTlsCipherPoliciesArgs(GetTlsCipherPoliciesArgs $) {
        this.ids = $.ids;
        this.includeListener = $.includeListener;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.status = $.status;
        this.tlsCipherPolicyName = $.tlsCipherPolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTlsCipherPoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTlsCipherPoliciesArgs $;

        public Builder() {
            $ = new GetTlsCipherPoliciesArgs();
        }

        public Builder(GetTlsCipherPoliciesArgs defaults) {
            $ = new GetTlsCipherPoliciesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Tls Cipher Policy IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Tls Cipher Policy IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Tls Cipher Policy IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param includeListener The include listener.
         * 
         * @return builder
         * 
         */
        public Builder includeListener(@Nullable Output<Boolean> includeListener) {
            $.includeListener = includeListener;
            return this;
        }

        /**
         * @param includeListener The include listener.
         * 
         * @return builder
         * 
         */
        public Builder includeListener(Boolean includeListener) {
            return includeListener(Output.of(includeListener));
        }

        /**
         * @param nameRegex A regex string to filter results by Tls Cipher Policy name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Tls Cipher Policy name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param status TLS policy instance state.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status TLS policy instance state.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tlsCipherPolicyName TLS policy name. Length is from 2 to 128, or in both the English and Chinese characters must be with an uppercase/lowercase letter or a Chinese character and the beginning, may contain numbers, in dot `.`, underscore `_` or dash `-`.
         * 
         * @return builder
         * 
         */
        public Builder tlsCipherPolicyName(@Nullable Output<String> tlsCipherPolicyName) {
            $.tlsCipherPolicyName = tlsCipherPolicyName;
            return this;
        }

        /**
         * @param tlsCipherPolicyName TLS policy name. Length is from 2 to 128, or in both the English and Chinese characters must be with an uppercase/lowercase letter or a Chinese character and the beginning, may contain numbers, in dot `.`, underscore `_` or dash `-`.
         * 
         * @return builder
         * 
         */
        public Builder tlsCipherPolicyName(String tlsCipherPolicyName) {
            return tlsCipherPolicyName(Output.of(tlsCipherPolicyName));
        }

        public GetTlsCipherPoliciesArgs build() {
            return $;
        }
    }

}