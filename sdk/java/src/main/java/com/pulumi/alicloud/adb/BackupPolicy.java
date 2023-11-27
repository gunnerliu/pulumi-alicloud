// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.adb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.adb.BackupPolicyArgs;
import com.pulumi.alicloud.adb.inputs.BackupPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ADB backup policy can be imported using the id or cluster id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:adb/backupPolicy:BackupPolicy example &#34;am-12345678&#34;
 * ```
 * 
 */
@ResourceType(type="alicloud:adb/backupPolicy:BackupPolicy")
public class BackupPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Cluster backup retention days, Fixed for 7 days, not modified.
     * 
     */
    @Export(name="backupRetentionPeriod", refs={String.class}, tree="[0]")
    private Output<String> backupRetentionPeriod;

    /**
     * @return Cluster backup retention days, Fixed for 7 days, not modified.
     * 
     */
    public Output<String> backupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }
    /**
     * The Id of cluster that can run database.
     * 
     */
    @Export(name="dbClusterId", refs={String.class}, tree="[0]")
    private Output<String> dbClusterId;

    /**
     * @return The Id of cluster that can run database.
     * 
     */
    public Output<String> dbClusterId() {
        return this.dbClusterId;
    }
    /**
     * ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
     * 
     */
    @Export(name="preferredBackupPeriods", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> preferredBackupPeriods;

    /**
     * @return ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
     * 
     */
    public Output<List<String>> preferredBackupPeriods() {
        return this.preferredBackupPeriods;
    }
    /**
     * ADB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. China time is 8 hours behind it.
     * 
     */
    @Export(name="preferredBackupTime", refs={String.class}, tree="[0]")
    private Output<String> preferredBackupTime;

    /**
     * @return ADB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. China time is 8 hours behind it.
     * 
     */
    public Output<String> preferredBackupTime() {
        return this.preferredBackupTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackupPolicy(String name) {
        this(name, BackupPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackupPolicy(String name, BackupPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackupPolicy(String name, BackupPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:adb/backupPolicy:BackupPolicy", name, args == null ? BackupPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BackupPolicy(String name, Output<String> id, @Nullable BackupPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:adb/backupPolicy:BackupPolicy", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BackupPolicy get(String name, Output<String> id, @Nullable BackupPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BackupPolicy(name, id, state, options);
    }
}
