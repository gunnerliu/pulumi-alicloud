// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ram

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a RAM Group Policy attachment resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/ram"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		group, err := ram.NewGroup(ctx, "group", &ram.GroupArgs{
// 			Comments: pulumi.String("this is a group comments."),
// 			Force:    pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		policy, err := ram.NewPolicy(ctx, "policy", &ram.PolicyArgs{
// 			Document:    pulumi.String(fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v", "    {\n", "      \"Statement\": [\n", "        {\n", "          \"Action\": [\n", "            \"oss:ListObjects\",\n", "            \"oss:GetObject\"\n", "          ],\n", "          \"Effect\": \"Allow\",\n", "          \"Resource\": [\n", "            \"acs:oss:*:*:mybucket\",\n", "            \"acs:oss:*:*:mybucket/*\"\n", "          ]\n", "        }\n", "      ],\n", "        \"Version\": \"1\"\n", "    }\n")),
// 			Description: pulumi.String("this is a policy test"),
// 			Force:       pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ram.NewGroupPolicyAttachment(ctx, "attach", &ram.GroupPolicyAttachmentArgs{
// 			PolicyName: policy.Name,
// 			PolicyType: policy.Type,
// 			GroupName:  group.Name,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// RAM Group Policy attachment can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ram/groupPolicyAttachment:GroupPolicyAttachment example group:my-policy:Custom:my-group
// ```
type GroupPolicyAttachment struct {
	pulumi.CustomResourceState

	// Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	GroupName pulumi.StringOutput `pulumi:"groupName"`
	// Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	PolicyName pulumi.StringOutput `pulumi:"policyName"`
	// Type of the RAM policy. It must be `Custom` or `System`.
	PolicyType pulumi.StringOutput `pulumi:"policyType"`
}

// NewGroupPolicyAttachment registers a new resource with the given unique name, arguments, and options.
func NewGroupPolicyAttachment(ctx *pulumi.Context,
	name string, args *GroupPolicyAttachmentArgs, opts ...pulumi.ResourceOption) (*GroupPolicyAttachment, error) {
	if args == nil || args.GroupName == nil {
		return nil, errors.New("missing required argument 'GroupName'")
	}
	if args == nil || args.PolicyName == nil {
		return nil, errors.New("missing required argument 'PolicyName'")
	}
	if args == nil || args.PolicyType == nil {
		return nil, errors.New("missing required argument 'PolicyType'")
	}
	if args == nil {
		args = &GroupPolicyAttachmentArgs{}
	}
	var resource GroupPolicyAttachment
	err := ctx.RegisterResource("alicloud:ram/groupPolicyAttachment:GroupPolicyAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGroupPolicyAttachment gets an existing GroupPolicyAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGroupPolicyAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GroupPolicyAttachmentState, opts ...pulumi.ResourceOption) (*GroupPolicyAttachment, error) {
	var resource GroupPolicyAttachment
	err := ctx.ReadResource("alicloud:ram/groupPolicyAttachment:GroupPolicyAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GroupPolicyAttachment resources.
type groupPolicyAttachmentState struct {
	// Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	GroupName *string `pulumi:"groupName"`
	// Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	PolicyName *string `pulumi:"policyName"`
	// Type of the RAM policy. It must be `Custom` or `System`.
	PolicyType *string `pulumi:"policyType"`
}

type GroupPolicyAttachmentState struct {
	// Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	GroupName pulumi.StringPtrInput
	// Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	PolicyName pulumi.StringPtrInput
	// Type of the RAM policy. It must be `Custom` or `System`.
	PolicyType pulumi.StringPtrInput
}

func (GroupPolicyAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*groupPolicyAttachmentState)(nil)).Elem()
}

type groupPolicyAttachmentArgs struct {
	// Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	GroupName string `pulumi:"groupName"`
	// Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	PolicyName string `pulumi:"policyName"`
	// Type of the RAM policy. It must be `Custom` or `System`.
	PolicyType string `pulumi:"policyType"`
}

// The set of arguments for constructing a GroupPolicyAttachment resource.
type GroupPolicyAttachmentArgs struct {
	// Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	GroupName pulumi.StringInput
	// Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	PolicyName pulumi.StringInput
	// Type of the RAM policy. It must be `Custom` or `System`.
	PolicyType pulumi.StringInput
}

func (GroupPolicyAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*groupPolicyAttachmentArgs)(nil)).Elem()
}

type GroupPolicyAttachmentInput interface {
	pulumi.Input

	ToGroupPolicyAttachmentOutput() GroupPolicyAttachmentOutput
	ToGroupPolicyAttachmentOutputWithContext(ctx context.Context) GroupPolicyAttachmentOutput
}

func (GroupPolicyAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((*GroupPolicyAttachment)(nil)).Elem()
}

func (i GroupPolicyAttachment) ToGroupPolicyAttachmentOutput() GroupPolicyAttachmentOutput {
	return i.ToGroupPolicyAttachmentOutputWithContext(context.Background())
}

func (i GroupPolicyAttachment) ToGroupPolicyAttachmentOutputWithContext(ctx context.Context) GroupPolicyAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupPolicyAttachmentOutput)
}

type GroupPolicyAttachmentOutput struct {
	*pulumi.OutputState
}

func (GroupPolicyAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GroupPolicyAttachmentOutput)(nil)).Elem()
}

func (o GroupPolicyAttachmentOutput) ToGroupPolicyAttachmentOutput() GroupPolicyAttachmentOutput {
	return o
}

func (o GroupPolicyAttachmentOutput) ToGroupPolicyAttachmentOutputWithContext(ctx context.Context) GroupPolicyAttachmentOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(GroupPolicyAttachmentOutput{})
}
