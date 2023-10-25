// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Resource Manager Folder resource. A folder is an organizational unit in a resource directory. You can use folders to build an organizational structure for resources.
 * For information about Resource Manager Foler and how to use it, see [What is Resource Manager Folder](https://www.alibabacloud.com/help/en/doc-detail/111221.htm).
 *
 * > **NOTE:** Available since v1.82.0.
 *
 * > **NOTE:** A maximum of five levels of folders can be created under the root folder.
 *
 * ## Import
 *
 * Resource Manager Folder can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:resourcemanager/folder:Folder example fd-u8B321****	
 * ```
 */
export class Folder extends pulumi.CustomResource {
    /**
     * Get an existing Folder resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FolderState, opts?: pulumi.CustomResourceOptions): Folder {
        return new Folder(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:resourcemanager/folder:Folder';

    /**
     * Returns true if the given object is an instance of Folder.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Folder {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Folder.__pulumiType;
    }

    /**
     * The name of the folder. The name must be 1 to 24 characters in length and can contain letters, digits, underscores (_), periods (.), and hyphens (-).
     */
    public readonly folderName!: pulumi.Output<string>;
    /**
     * The ID of the parent folder. If not set, the system default value will be used.
     */
    public readonly parentFolderId!: pulumi.Output<string>;

    /**
     * Create a Folder resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FolderArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FolderArgs | FolderState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FolderState | undefined;
            resourceInputs["folderName"] = state ? state.folderName : undefined;
            resourceInputs["parentFolderId"] = state ? state.parentFolderId : undefined;
        } else {
            const args = argsOrState as FolderArgs | undefined;
            if ((!args || args.folderName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'folderName'");
            }
            resourceInputs["folderName"] = args ? args.folderName : undefined;
            resourceInputs["parentFolderId"] = args ? args.parentFolderId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Folder.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Folder resources.
 */
export interface FolderState {
    /**
     * The name of the folder. The name must be 1 to 24 characters in length and can contain letters, digits, underscores (_), periods (.), and hyphens (-).
     */
    folderName?: pulumi.Input<string>;
    /**
     * The ID of the parent folder. If not set, the system default value will be used.
     */
    parentFolderId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Folder resource.
 */
export interface FolderArgs {
    /**
     * The name of the folder. The name must be 1 to 24 characters in length and can contain letters, digits, underscores (_), periods (.), and hyphens (-).
     */
    folderName: pulumi.Input<string>;
    /**
     * The ID of the parent folder. If not set, the system default value will be used.
     */
    parentFolderId?: pulumi.Input<string>;
}
