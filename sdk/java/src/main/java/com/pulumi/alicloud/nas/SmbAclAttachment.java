// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.nas.SmbAclAttachmentArgs;
import com.pulumi.alicloud.nas.inputs.SmbAclAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Nas Smb Acl resource.
 * 
 * Alibaba Cloud SMB protocol file storage service supports user authentication based on AD domain system and permission access control at the file system level. Connecting and accessing the SMB file system as a domain user can implement the requirements for access control at the file and directory level in the SMB protocol file system. The current Alibaba Cloud SMB protocol file storage service does not support multi-user file and directory-level permission access control, and only provides file system-level authentication and access based on the whitelist mechanism that supports cloud accounts and source IP permission groups control.
 * &gt; **NOTE:** Available in 1.186.0+.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.nas.FileSystem;
 * import com.pulumi.alicloud.nas.FileSystemArgs;
 * import com.pulumi.alicloud.nas.SmbAclAttachment;
 * import com.pulumi.alicloud.nas.SmbAclAttachmentArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleFileSystem = new FileSystem(&#34;exampleFileSystem&#34;, FileSystemArgs.builder()        
 *             .protocolType(&#34;SMB&#34;)
 *             .storageType(&#34;Performance&#34;)
 *             .fileSystemType(&#34;standard&#34;)
 *             .zoneId(&#34;cn-hangzhou-g&#34;)
 *             .build());
 * 
 *         var exampleSmbAclAttachment = new SmbAclAttachment(&#34;exampleSmbAclAttachment&#34;, SmbAclAttachmentArgs.builder()        
 *             .fileSystemId(exampleFileSystem.id())
 *             .keytab(&#34;BQIAAABHAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAAQAIqIx6v7p11oUAAABHAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAAwAIqIx6v7p11oUAAABPAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAFwAQnQZWB3RAPHU7PMIJyBWePAAAAF8AAgANQUxJQURURVNULkNPTQAEY2lmcwAZc21ic2VydmVyMjQuYWxpYWR0ZXN0LmNvbQAAAAEAAAAAAQASACAGJ7F0s+bcBjf6jD5HlvlRLmPSOW+qDZe0Qk0lQcf8WwAAAE8AAgANQUxJQURURVNULkNPTQAEY2lmcwAZc21ic2VydmVyMjQuYWxpYWR0ZXN0LmNvbQAAAAEAAAAAAQARABDdFmanrSIatnDDhxxxxx&#34;)
 *             .keytabMd5(&#34;E3CCF7E2416DF04FA958AA4513*****&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="alicloud:nas/smbAclAttachment:SmbAclAttachment")
public class SmbAclAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The method that is used to authenticate network identities.
     * 
     */
    @Export(name="authMethod", type=String.class, parameters={})
    private Output<String> authMethod;

    /**
     * @return The method that is used to authenticate network identities.
     * 
     */
    public Output<String> authMethod() {
        return this.authMethod;
    }
    /**
     * Specifies whether to allow anonymous access. Valid values:
     * true: The file system allows anonymous access.
     * false: The file system denies anonymous access. Default value: false.
     * 
     */
    @Export(name="enableAnonymousAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAnonymousAccess;

    /**
     * @return Specifies whether to allow anonymous access. Valid values:
     * true: The file system allows anonymous access.
     * false: The file system denies anonymous access. Default value: false.
     * 
     */
    public Output<Optional<Boolean>> enableAnonymousAccess() {
        return Codegen.optional(this.enableAnonymousAccess);
    }
    /**
     * Specifies whether to enable the ACL feature.
     * true: enables the ACL feature.
     * false: disables the ACL feature.
     * 
     */
    @Export(name="enabled", type=String.class, parameters={})
    private Output<String> enabled;

    /**
     * @return Specifies whether to enable the ACL feature.
     * true: enables the ACL feature.
     * false: disables the ACL feature.
     * 
     */
    public Output<String> enabled() {
        return this.enabled;
    }
    /**
     * Specifies whether to enable encryption in transit. Valid values:
     * true: enables encryption in transit.
     * false: disables encryption in transit. Default value: false.
     * 
     */
    @Export(name="encryptData", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> encryptData;

    /**
     * @return Specifies whether to enable encryption in transit. Valid values:
     * true: enables encryption in transit.
     * false: disables encryption in transit. Default value: false.
     * 
     */
    public Output<Optional<Boolean>> encryptData() {
        return Codegen.optional(this.encryptData);
    }
    /**
     * The ID of the file system.
     * 
     */
    @Export(name="fileSystemId", type=String.class, parameters={})
    private Output<String> fileSystemId;

    /**
     * @return The ID of the file system.
     * 
     */
    public Output<String> fileSystemId() {
        return this.fileSystemId;
    }
    /**
     * The home directory of each user. Each user-specific home directory must meet the following requirements:\
     * Each segment starts with a forward slash (/) or a backslash (\).
     * Each segment does not contain the following special characters: &lt;&gt;&#34;:?*.
     * Each segment is 0 to 255 characters in length.
     * The total length is 0 to 32,767 characters.
     * For example, if you create a user named A and the home directory is /home, the file system automatically creates a directory named /home/A when User A logs on to the file system. If the /home/A directory already exists, the file system does not create the directory.
     * 
     */
    @Export(name="homeDirPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> homeDirPath;

    /**
     * @return The home directory of each user. Each user-specific home directory must meet the following requirements:\
     * Each segment starts with a forward slash (/) or a backslash (\).
     * Each segment does not contain the following special characters: &lt;&gt;&#34;:?*.
     * Each segment is 0 to 255 characters in length.
     * The total length is 0 to 32,767 characters.
     * For example, if you create a user named A and the home directory is /home, the file system automatically creates a directory named /home/A when User A logs on to the file system. If the /home/A directory already exists, the file system does not create the directory.
     * 
     */
    public Output<Optional<String>> homeDirPath() {
        return Codegen.optional(this.homeDirPath);
    }
    /**
     * The string that is generated after the system encodes the keytab file by using Base64.
     * 
     */
    @Export(name="keytab", type=String.class, parameters={})
    private Output<String> keytab;

    /**
     * @return The string that is generated after the system encodes the keytab file by using Base64.
     * 
     */
    public Output<String> keytab() {
        return this.keytab;
    }
    /**
     * RThe string that is generated after the system encodes the keytab file by using MD5.
     * 
     */
    @Export(name="keytabMd5", type=String.class, parameters={})
    private Output<String> keytabMd5;

    /**
     * @return RThe string that is generated after the system encodes the keytab file by using MD5.
     * 
     */
    public Output<String> keytabMd5() {
        return this.keytabMd5;
    }
    /**
     * Specifies whether to deny access from non-encrypted clients. Valid values:
     * true: The file system denies access from non-encrypted clients.
     * false: The file system allows access from non-encrypted clients. Default value: false.
     * 
     */
    @Export(name="rejectUnencryptedAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> rejectUnencryptedAccess;

    /**
     * @return Specifies whether to deny access from non-encrypted clients. Valid values:
     * true: The file system denies access from non-encrypted clients.
     * false: The file system allows access from non-encrypted clients. Default value: false.
     * 
     */
    public Output<Optional<Boolean>> rejectUnencryptedAccess() {
        return Codegen.optional(this.rejectUnencryptedAccess);
    }
    /**
     * The ID of a super admin. The ID must meet the following requirements:
     * The ID starts with S and does not contain letters except S.
     * The ID contains at least three hyphens (-) as delimiters.
     * Example: S-1-5-22 and S-1-5-22-23.
     * 
     */
    @Export(name="superAdminSid", type=String.class, parameters={})
    private Output</* @Nullable */ String> superAdminSid;

    /**
     * @return The ID of a super admin. The ID must meet the following requirements:
     * The ID starts with S and does not contain letters except S.
     * The ID contains at least three hyphens (-) as delimiters.
     * Example: S-1-5-22 and S-1-5-22-23.
     * 
     */
    public Output<Optional<String>> superAdminSid() {
        return Codegen.optional(this.superAdminSid);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SmbAclAttachment(String name) {
        this(name, SmbAclAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SmbAclAttachment(String name, SmbAclAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SmbAclAttachment(String name, SmbAclAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:nas/smbAclAttachment:SmbAclAttachment", name, args == null ? SmbAclAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SmbAclAttachment(String name, Output<String> id, @Nullable SmbAclAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:nas/smbAclAttachment:SmbAclAttachment", name, state, makeResourceOptions(options, id));
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
    public static SmbAclAttachment get(String name, Output<String> id, @Nullable SmbAclAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SmbAclAttachment(name, id, state, options);
    }
}
