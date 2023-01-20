// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.polardb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterDbClusterIpArrayArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterDbClusterIpArrayArgs Empty = new ClusterDbClusterIpArrayArgs();

    /**
     * The name of the IP whitelist group. The group name must be 2 to 120 characters in length and consists of lowercase letters and digits. It must start with a letter, and end with a letter or a digit.
     * **NOTE:** If the specified whitelist group name does not exist, the whitelist group is created. If the specified whitelist group name exists, the whitelist group is modified. If you do not specify this parameter, the default group is modified. You can create a maximum of 50 IP whitelist groups for a cluster.
     * 
     */
    @Import(name="dbClusterIpArrayName")
    private @Nullable Output<String> dbClusterIpArrayName;

    /**
     * @return The name of the IP whitelist group. The group name must be 2 to 120 characters in length and consists of lowercase letters and digits. It must start with a letter, and end with a letter or a digit.
     * **NOTE:** If the specified whitelist group name does not exist, the whitelist group is created. If the specified whitelist group name exists, the whitelist group is modified. If you do not specify this parameter, the default group is modified. You can create a maximum of 50 IP whitelist groups for a cluster.
     * 
     */
    public Optional<Output<String>> dbClusterIpArrayName() {
        return Optional.ofNullable(this.dbClusterIpArrayName);
    }

    /**
     * The method for modifying the IP whitelist. Valid values are `Cover`, `Append`, `Delete`.
     * **NOTE:** There does not recommend setting modify_mode to `Append` or `Delete` and it will bring a potential diff error.
     * 
     */
    @Import(name="modifyMode")
    private @Nullable Output<String> modifyMode;

    /**
     * @return The method for modifying the IP whitelist. Valid values are `Cover`, `Append`, `Delete`.
     * **NOTE:** There does not recommend setting modify_mode to `Append` or `Delete` and it will bring a potential diff error.
     * 
     */
    public Optional<Output<String>> modifyMode() {
        return Optional.ofNullable(this.modifyMode);
    }

    /**
     * This attribute has been deprecated from v1.130.0 and using `db_cluster_ip_array` sub-element `security_ips` instead.
     * Its value is same as `db_cluster_ip_array` sub-element `security_ips` value and its db_cluster_ip_array_name is &#34;default&#34;.
     * 
     */
    @Import(name="securityIps")
    private @Nullable Output<List<String>> securityIps;

    /**
     * @return This attribute has been deprecated from v1.130.0 and using `db_cluster_ip_array` sub-element `security_ips` instead.
     * Its value is same as `db_cluster_ip_array` sub-element `security_ips` value and its db_cluster_ip_array_name is &#34;default&#34;.
     * 
     */
    public Optional<Output<List<String>>> securityIps() {
        return Optional.ofNullable(this.securityIps);
    }

    private ClusterDbClusterIpArrayArgs() {}

    private ClusterDbClusterIpArrayArgs(ClusterDbClusterIpArrayArgs $) {
        this.dbClusterIpArrayName = $.dbClusterIpArrayName;
        this.modifyMode = $.modifyMode;
        this.securityIps = $.securityIps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterDbClusterIpArrayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterDbClusterIpArrayArgs $;

        public Builder() {
            $ = new ClusterDbClusterIpArrayArgs();
        }

        public Builder(ClusterDbClusterIpArrayArgs defaults) {
            $ = new ClusterDbClusterIpArrayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbClusterIpArrayName The name of the IP whitelist group. The group name must be 2 to 120 characters in length and consists of lowercase letters and digits. It must start with a letter, and end with a letter or a digit.
         * **NOTE:** If the specified whitelist group name does not exist, the whitelist group is created. If the specified whitelist group name exists, the whitelist group is modified. If you do not specify this parameter, the default group is modified. You can create a maximum of 50 IP whitelist groups for a cluster.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterIpArrayName(@Nullable Output<String> dbClusterIpArrayName) {
            $.dbClusterIpArrayName = dbClusterIpArrayName;
            return this;
        }

        /**
         * @param dbClusterIpArrayName The name of the IP whitelist group. The group name must be 2 to 120 characters in length and consists of lowercase letters and digits. It must start with a letter, and end with a letter or a digit.
         * **NOTE:** If the specified whitelist group name does not exist, the whitelist group is created. If the specified whitelist group name exists, the whitelist group is modified. If you do not specify this parameter, the default group is modified. You can create a maximum of 50 IP whitelist groups for a cluster.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterIpArrayName(String dbClusterIpArrayName) {
            return dbClusterIpArrayName(Output.of(dbClusterIpArrayName));
        }

        /**
         * @param modifyMode The method for modifying the IP whitelist. Valid values are `Cover`, `Append`, `Delete`.
         * **NOTE:** There does not recommend setting modify_mode to `Append` or `Delete` and it will bring a potential diff error.
         * 
         * @return builder
         * 
         */
        public Builder modifyMode(@Nullable Output<String> modifyMode) {
            $.modifyMode = modifyMode;
            return this;
        }

        /**
         * @param modifyMode The method for modifying the IP whitelist. Valid values are `Cover`, `Append`, `Delete`.
         * **NOTE:** There does not recommend setting modify_mode to `Append` or `Delete` and it will bring a potential diff error.
         * 
         * @return builder
         * 
         */
        public Builder modifyMode(String modifyMode) {
            return modifyMode(Output.of(modifyMode));
        }

        /**
         * @param securityIps This attribute has been deprecated from v1.130.0 and using `db_cluster_ip_array` sub-element `security_ips` instead.
         * Its value is same as `db_cluster_ip_array` sub-element `security_ips` value and its db_cluster_ip_array_name is &#34;default&#34;.
         * 
         * @return builder
         * 
         */
        public Builder securityIps(@Nullable Output<List<String>> securityIps) {
            $.securityIps = securityIps;
            return this;
        }

        /**
         * @param securityIps This attribute has been deprecated from v1.130.0 and using `db_cluster_ip_array` sub-element `security_ips` instead.
         * Its value is same as `db_cluster_ip_array` sub-element `security_ips` value and its db_cluster_ip_array_name is &#34;default&#34;.
         * 
         * @return builder
         * 
         */
        public Builder securityIps(List<String> securityIps) {
            return securityIps(Output.of(securityIps));
        }

        /**
         * @param securityIps This attribute has been deprecated from v1.130.0 and using `db_cluster_ip_array` sub-element `security_ips` instead.
         * Its value is same as `db_cluster_ip_array` sub-element `security_ips` value and its db_cluster_ip_array_name is &#34;default&#34;.
         * 
         * @return builder
         * 
         */
        public Builder securityIps(String... securityIps) {
            return securityIps(List.of(securityIps));
        }

        public ClusterDbClusterIpArrayArgs build() {
            return $;
        }
    }

}
