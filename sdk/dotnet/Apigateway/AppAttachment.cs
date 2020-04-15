// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ApiGateway
{
    public partial class AppAttachment : Pulumi.CustomResource
    {
        /// <summary>
        /// The api_id that app apply to access.
        /// </summary>
        [Output("apiId")]
        public Output<string> ApiId { get; private set; } = null!;

        /// <summary>
        /// The app that apply to the authorization.
        /// </summary>
        [Output("appId")]
        public Output<string> AppId { get; private set; } = null!;

        /// <summary>
        /// The group that the api belongs to.
        /// </summary>
        [Output("groupId")]
        public Output<string> GroupId { get; private set; } = null!;

        /// <summary>
        /// Stage that the app apply to access.
        /// </summary>
        [Output("stageName")]
        public Output<string> StageName { get; private set; } = null!;


        /// <summary>
        /// Create a AppAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AppAttachment(string name, AppAttachmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:apigateway/appAttachment:AppAttachment", name, args ?? new AppAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AppAttachment(string name, Input<string> id, AppAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:apigateway/appAttachment:AppAttachment", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AppAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AppAttachment Get(string name, Input<string> id, AppAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new AppAttachment(name, id, state, options);
        }
    }

    public sealed class AppAttachmentArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The api_id that app apply to access.
        /// </summary>
        [Input("apiId", required: true)]
        public Input<string> ApiId { get; set; } = null!;

        /// <summary>
        /// The app that apply to the authorization.
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// The group that the api belongs to.
        /// </summary>
        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        /// <summary>
        /// Stage that the app apply to access.
        /// </summary>
        [Input("stageName", required: true)]
        public Input<string> StageName { get; set; } = null!;

        public AppAttachmentArgs()
        {
        }
    }

    public sealed class AppAttachmentState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The api_id that app apply to access.
        /// </summary>
        [Input("apiId")]
        public Input<string>? ApiId { get; set; }

        /// <summary>
        /// The app that apply to the authorization.
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// The group that the api belongs to.
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// Stage that the app apply to access.
        /// </summary>
        [Input("stageName")]
        public Input<string>? StageName { get; set; }

        public AppAttachmentState()
        {
        }
    }
}
