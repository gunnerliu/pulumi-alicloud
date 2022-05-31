// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb
{
    /// <summary>
    /// Provides a Application Load Balancer (ALB) Listener Additional Certificate Attachment resource.
    /// 
    /// For information about Application Load Balancer (ALB) Listener Additional Certificate Attachment and how to use it, see [What is Listener Additional Certificate Attachment](https://www.alibabacloud.com/help/en/doc-detail/302356.html).
    /// 
    /// &gt; **NOTE:** Available in v1.161.0+.
    /// 
    /// ## Import
    /// 
    /// Application Load Balancer (ALB) Listener Additional Certificate Attachment can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:alb/listenerAdditionalCertificateAttachment:ListenerAdditionalCertificateAttachment example &lt;listener_id&gt;:&lt;certificate_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:alb/listenerAdditionalCertificateAttachment:ListenerAdditionalCertificateAttachment")]
    public partial class ListenerAdditionalCertificateAttachment : Pulumi.CustomResource
    {
        /// <summary>
        /// The Certificate ID.
        /// </summary>
        [Output("certificateId")]
        public Output<string> CertificateId { get; private set; } = null!;

        /// <summary>
        /// The type of the certificate.
        /// </summary>
        [Output("certificateType")]
        public Output<string> CertificateType { get; private set; } = null!;

        /// <summary>
        /// The ID of the ALB listener.
        /// </summary>
        [Output("listenerId")]
        public Output<string> ListenerId { get; private set; } = null!;

        /// <summary>
        /// The status of the certificate.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a ListenerAdditionalCertificateAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ListenerAdditionalCertificateAttachment(string name, ListenerAdditionalCertificateAttachmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:alb/listenerAdditionalCertificateAttachment:ListenerAdditionalCertificateAttachment", name, args ?? new ListenerAdditionalCertificateAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ListenerAdditionalCertificateAttachment(string name, Input<string> id, ListenerAdditionalCertificateAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:alb/listenerAdditionalCertificateAttachment:ListenerAdditionalCertificateAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ListenerAdditionalCertificateAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ListenerAdditionalCertificateAttachment Get(string name, Input<string> id, ListenerAdditionalCertificateAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new ListenerAdditionalCertificateAttachment(name, id, state, options);
        }
    }

    public sealed class ListenerAdditionalCertificateAttachmentArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Certificate ID.
        /// </summary>
        [Input("certificateId", required: true)]
        public Input<string> CertificateId { get; set; } = null!;

        /// <summary>
        /// The ID of the ALB listener.
        /// </summary>
        [Input("listenerId", required: true)]
        public Input<string> ListenerId { get; set; } = null!;

        public ListenerAdditionalCertificateAttachmentArgs()
        {
        }
    }

    public sealed class ListenerAdditionalCertificateAttachmentState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Certificate ID.
        /// </summary>
        [Input("certificateId")]
        public Input<string>? CertificateId { get; set; }

        /// <summary>
        /// The type of the certificate.
        /// </summary>
        [Input("certificateType")]
        public Input<string>? CertificateType { get; set; }

        /// <summary>
        /// The ID of the ALB listener.
        /// </summary>
        [Input("listenerId")]
        public Input<string>? ListenerId { get; set; }

        /// <summary>
        /// The status of the certificate.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public ListenerAdditionalCertificateAttachmentState()
        {
        }
    }
}
