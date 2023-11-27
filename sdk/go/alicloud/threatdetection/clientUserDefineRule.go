// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package threatdetection

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Threat Detection Client User Define Rule resource. Malicious Behavior Defense Custom Rules.
//
// For information about Threat Detection Client User Define Rule and how to use it, see [What is Client User Define Rule](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-addclientuserdefinerule).
//
// > **NOTE:** Available since v1.212.0.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/threatdetection"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_, err := threatdetection.NewClientUserDefineRule(ctx, "default", &threatdetection.ClientUserDefineRuleArgs{
//				ActionType:               pulumi.Int(0),
//				Platform:                 pulumi.String("windows"),
//				RegistryContent:          pulumi.String("123"),
//				ClientUserDefineRuleName: pulumi.String(name),
//				ParentProcPath:           pulumi.String("/root/bash"),
//				Type:                     pulumi.Int(5),
//				Cmdline:                  pulumi.String("bash"),
//				ProcPath:                 pulumi.String("/root/bash"),
//				ParentCmdline:            pulumi.String("bash"),
//				RegistryKey:              pulumi.String("123"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Threat Detection Client User Define Rule can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:threatdetection/clientUserDefineRule:ClientUserDefineRule example <id>
//
// ```
type ClientUserDefineRule struct {
	pulumi.CustomResourceState

	// The operation type. Value:
	// - **0**: plus White
	// - **1**: Plus Black.
	ActionType pulumi.IntOutput `pulumi:"actionType"`
	// The custom rule name.
	ClientUserDefineRuleName pulumi.StringOutput `pulumi:"clientUserDefineRuleName"`
	// Command line. When the value of the Type attribute is 2, 3, 4, 5, 6, or 7, the command line field is required.
	Cmdline pulumi.StringPtrOutput `pulumi:"cmdline"`
	// The creation time of the resource.
	CreateTime pulumi.IntOutput `pulumi:"createTime"`
	// The file path. When the value of the Type attribute is 4 or 6, 7, the FilePath field is required.
	FilePath pulumi.StringPtrOutput `pulumi:"filePath"`
	// Process hash list. When the value of the Type attribute is 1, the Hash attribute is required.
	Hash pulumi.StringPtrOutput `pulumi:"hash"`
	// IP address. When the value of the Type attribute is 3, the Ip attribute is required.
	Ip pulumi.StringPtrOutput `pulumi:"ip"`
	// The new file path to rename the file. When the value of the Type attribute is 7, the NewFilePath attribute is required.
	NewFilePath pulumi.StringPtrOutput `pulumi:"newFilePath"`
	// The parent command line.
	ParentCmdline pulumi.StringPtrOutput `pulumi:"parentCmdline"`
	// Parent process path.
	ParentProcPath pulumi.StringPtrOutput `pulumi:"parentProcPath"`
	// The operating system type. Value:
	// - **windows**:widows
	// - **linux**:linux
	// - **all**: all.
	Platform pulumi.StringOutput `pulumi:"platform"`
	// The port number. When the value of the Type attribute is 3, the PortStr attribute is required. Value range: **1-65535**.
	PortStr pulumi.StringOutput `pulumi:"portStr"`
	// The process path. When the Type attribute is set to 2, 3, 4, 5, 6, or 7, the ProcPath attribute is required.
	ProcPath pulumi.StringPtrOutput `pulumi:"procPath"`
	// The registry value. When the value of the Type attribute is 5, the RegistryKey attribute is required.
	RegistryContent pulumi.StringPtrOutput `pulumi:"registryContent"`
	// The registry key. When the value of the Type attribute is 5, the RegistryKey attribute is required.
	RegistryKey pulumi.StringPtrOutput `pulumi:"registryKey"`
	// The rule type. Value:
	// - **1**: Process hash
	// - **2**: command line
	// - **3**: Process network
	// - **4**: File reading and writing
	// - **5**: Operate the registry
	// - **6**: Load Dynamic Link Library
	// - **7**: File Rename.
	Type pulumi.IntOutput `pulumi:"type"`
}

// NewClientUserDefineRule registers a new resource with the given unique name, arguments, and options.
func NewClientUserDefineRule(ctx *pulumi.Context,
	name string, args *ClientUserDefineRuleArgs, opts ...pulumi.ResourceOption) (*ClientUserDefineRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ActionType == nil {
		return nil, errors.New("invalid value for required argument 'ActionType'")
	}
	if args.ClientUserDefineRuleName == nil {
		return nil, errors.New("invalid value for required argument 'ClientUserDefineRuleName'")
	}
	if args.Platform == nil {
		return nil, errors.New("invalid value for required argument 'Platform'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ClientUserDefineRule
	err := ctx.RegisterResource("alicloud:threatdetection/clientUserDefineRule:ClientUserDefineRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClientUserDefineRule gets an existing ClientUserDefineRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClientUserDefineRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClientUserDefineRuleState, opts ...pulumi.ResourceOption) (*ClientUserDefineRule, error) {
	var resource ClientUserDefineRule
	err := ctx.ReadResource("alicloud:threatdetection/clientUserDefineRule:ClientUserDefineRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClientUserDefineRule resources.
type clientUserDefineRuleState struct {
	// The operation type. Value:
	// - **0**: plus White
	// - **1**: Plus Black.
	ActionType *int `pulumi:"actionType"`
	// The custom rule name.
	ClientUserDefineRuleName *string `pulumi:"clientUserDefineRuleName"`
	// Command line. When the value of the Type attribute is 2, 3, 4, 5, 6, or 7, the command line field is required.
	Cmdline *string `pulumi:"cmdline"`
	// The creation time of the resource.
	CreateTime *int `pulumi:"createTime"`
	// The file path. When the value of the Type attribute is 4 or 6, 7, the FilePath field is required.
	FilePath *string `pulumi:"filePath"`
	// Process hash list. When the value of the Type attribute is 1, the Hash attribute is required.
	Hash *string `pulumi:"hash"`
	// IP address. When the value of the Type attribute is 3, the Ip attribute is required.
	Ip *string `pulumi:"ip"`
	// The new file path to rename the file. When the value of the Type attribute is 7, the NewFilePath attribute is required.
	NewFilePath *string `pulumi:"newFilePath"`
	// The parent command line.
	ParentCmdline *string `pulumi:"parentCmdline"`
	// Parent process path.
	ParentProcPath *string `pulumi:"parentProcPath"`
	// The operating system type. Value:
	// - **windows**:widows
	// - **linux**:linux
	// - **all**: all.
	Platform *string `pulumi:"platform"`
	// The port number. When the value of the Type attribute is 3, the PortStr attribute is required. Value range: **1-65535**.
	PortStr *string `pulumi:"portStr"`
	// The process path. When the Type attribute is set to 2, 3, 4, 5, 6, or 7, the ProcPath attribute is required.
	ProcPath *string `pulumi:"procPath"`
	// The registry value. When the value of the Type attribute is 5, the RegistryKey attribute is required.
	RegistryContent *string `pulumi:"registryContent"`
	// The registry key. When the value of the Type attribute is 5, the RegistryKey attribute is required.
	RegistryKey *string `pulumi:"registryKey"`
	// The rule type. Value:
	// - **1**: Process hash
	// - **2**: command line
	// - **3**: Process network
	// - **4**: File reading and writing
	// - **5**: Operate the registry
	// - **6**: Load Dynamic Link Library
	// - **7**: File Rename.
	Type *int `pulumi:"type"`
}

type ClientUserDefineRuleState struct {
	// The operation type. Value:
	// - **0**: plus White
	// - **1**: Plus Black.
	ActionType pulumi.IntPtrInput
	// The custom rule name.
	ClientUserDefineRuleName pulumi.StringPtrInput
	// Command line. When the value of the Type attribute is 2, 3, 4, 5, 6, or 7, the command line field is required.
	Cmdline pulumi.StringPtrInput
	// The creation time of the resource.
	CreateTime pulumi.IntPtrInput
	// The file path. When the value of the Type attribute is 4 or 6, 7, the FilePath field is required.
	FilePath pulumi.StringPtrInput
	// Process hash list. When the value of the Type attribute is 1, the Hash attribute is required.
	Hash pulumi.StringPtrInput
	// IP address. When the value of the Type attribute is 3, the Ip attribute is required.
	Ip pulumi.StringPtrInput
	// The new file path to rename the file. When the value of the Type attribute is 7, the NewFilePath attribute is required.
	NewFilePath pulumi.StringPtrInput
	// The parent command line.
	ParentCmdline pulumi.StringPtrInput
	// Parent process path.
	ParentProcPath pulumi.StringPtrInput
	// The operating system type. Value:
	// - **windows**:widows
	// - **linux**:linux
	// - **all**: all.
	Platform pulumi.StringPtrInput
	// The port number. When the value of the Type attribute is 3, the PortStr attribute is required. Value range: **1-65535**.
	PortStr pulumi.StringPtrInput
	// The process path. When the Type attribute is set to 2, 3, 4, 5, 6, or 7, the ProcPath attribute is required.
	ProcPath pulumi.StringPtrInput
	// The registry value. When the value of the Type attribute is 5, the RegistryKey attribute is required.
	RegistryContent pulumi.StringPtrInput
	// The registry key. When the value of the Type attribute is 5, the RegistryKey attribute is required.
	RegistryKey pulumi.StringPtrInput
	// The rule type. Value:
	// - **1**: Process hash
	// - **2**: command line
	// - **3**: Process network
	// - **4**: File reading and writing
	// - **5**: Operate the registry
	// - **6**: Load Dynamic Link Library
	// - **7**: File Rename.
	Type pulumi.IntPtrInput
}

func (ClientUserDefineRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*clientUserDefineRuleState)(nil)).Elem()
}

type clientUserDefineRuleArgs struct {
	// The operation type. Value:
	// - **0**: plus White
	// - **1**: Plus Black.
	ActionType int `pulumi:"actionType"`
	// The custom rule name.
	ClientUserDefineRuleName string `pulumi:"clientUserDefineRuleName"`
	// Command line. When the value of the Type attribute is 2, 3, 4, 5, 6, or 7, the command line field is required.
	Cmdline *string `pulumi:"cmdline"`
	// The file path. When the value of the Type attribute is 4 or 6, 7, the FilePath field is required.
	FilePath *string `pulumi:"filePath"`
	// Process hash list. When the value of the Type attribute is 1, the Hash attribute is required.
	Hash *string `pulumi:"hash"`
	// IP address. When the value of the Type attribute is 3, the Ip attribute is required.
	Ip *string `pulumi:"ip"`
	// The new file path to rename the file. When the value of the Type attribute is 7, the NewFilePath attribute is required.
	NewFilePath *string `pulumi:"newFilePath"`
	// The parent command line.
	ParentCmdline *string `pulumi:"parentCmdline"`
	// Parent process path.
	ParentProcPath *string `pulumi:"parentProcPath"`
	// The operating system type. Value:
	// - **windows**:widows
	// - **linux**:linux
	// - **all**: all.
	Platform string `pulumi:"platform"`
	// The port number. When the value of the Type attribute is 3, the PortStr attribute is required. Value range: **1-65535**.
	PortStr *string `pulumi:"portStr"`
	// The process path. When the Type attribute is set to 2, 3, 4, 5, 6, or 7, the ProcPath attribute is required.
	ProcPath *string `pulumi:"procPath"`
	// The registry value. When the value of the Type attribute is 5, the RegistryKey attribute is required.
	RegistryContent *string `pulumi:"registryContent"`
	// The registry key. When the value of the Type attribute is 5, the RegistryKey attribute is required.
	RegistryKey *string `pulumi:"registryKey"`
	// The rule type. Value:
	// - **1**: Process hash
	// - **2**: command line
	// - **3**: Process network
	// - **4**: File reading and writing
	// - **5**: Operate the registry
	// - **6**: Load Dynamic Link Library
	// - **7**: File Rename.
	Type int `pulumi:"type"`
}

// The set of arguments for constructing a ClientUserDefineRule resource.
type ClientUserDefineRuleArgs struct {
	// The operation type. Value:
	// - **0**: plus White
	// - **1**: Plus Black.
	ActionType pulumi.IntInput
	// The custom rule name.
	ClientUserDefineRuleName pulumi.StringInput
	// Command line. When the value of the Type attribute is 2, 3, 4, 5, 6, or 7, the command line field is required.
	Cmdline pulumi.StringPtrInput
	// The file path. When the value of the Type attribute is 4 or 6, 7, the FilePath field is required.
	FilePath pulumi.StringPtrInput
	// Process hash list. When the value of the Type attribute is 1, the Hash attribute is required.
	Hash pulumi.StringPtrInput
	// IP address. When the value of the Type attribute is 3, the Ip attribute is required.
	Ip pulumi.StringPtrInput
	// The new file path to rename the file. When the value of the Type attribute is 7, the NewFilePath attribute is required.
	NewFilePath pulumi.StringPtrInput
	// The parent command line.
	ParentCmdline pulumi.StringPtrInput
	// Parent process path.
	ParentProcPath pulumi.StringPtrInput
	// The operating system type. Value:
	// - **windows**:widows
	// - **linux**:linux
	// - **all**: all.
	Platform pulumi.StringInput
	// The port number. When the value of the Type attribute is 3, the PortStr attribute is required. Value range: **1-65535**.
	PortStr pulumi.StringPtrInput
	// The process path. When the Type attribute is set to 2, 3, 4, 5, 6, or 7, the ProcPath attribute is required.
	ProcPath pulumi.StringPtrInput
	// The registry value. When the value of the Type attribute is 5, the RegistryKey attribute is required.
	RegistryContent pulumi.StringPtrInput
	// The registry key. When the value of the Type attribute is 5, the RegistryKey attribute is required.
	RegistryKey pulumi.StringPtrInput
	// The rule type. Value:
	// - **1**: Process hash
	// - **2**: command line
	// - **3**: Process network
	// - **4**: File reading and writing
	// - **5**: Operate the registry
	// - **6**: Load Dynamic Link Library
	// - **7**: File Rename.
	Type pulumi.IntInput
}

func (ClientUserDefineRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clientUserDefineRuleArgs)(nil)).Elem()
}

type ClientUserDefineRuleInput interface {
	pulumi.Input

	ToClientUserDefineRuleOutput() ClientUserDefineRuleOutput
	ToClientUserDefineRuleOutputWithContext(ctx context.Context) ClientUserDefineRuleOutput
}

func (*ClientUserDefineRule) ElementType() reflect.Type {
	return reflect.TypeOf((**ClientUserDefineRule)(nil)).Elem()
}

func (i *ClientUserDefineRule) ToClientUserDefineRuleOutput() ClientUserDefineRuleOutput {
	return i.ToClientUserDefineRuleOutputWithContext(context.Background())
}

func (i *ClientUserDefineRule) ToClientUserDefineRuleOutputWithContext(ctx context.Context) ClientUserDefineRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientUserDefineRuleOutput)
}

// ClientUserDefineRuleArrayInput is an input type that accepts ClientUserDefineRuleArray and ClientUserDefineRuleArrayOutput values.
// You can construct a concrete instance of `ClientUserDefineRuleArrayInput` via:
//
//	ClientUserDefineRuleArray{ ClientUserDefineRuleArgs{...} }
type ClientUserDefineRuleArrayInput interface {
	pulumi.Input

	ToClientUserDefineRuleArrayOutput() ClientUserDefineRuleArrayOutput
	ToClientUserDefineRuleArrayOutputWithContext(context.Context) ClientUserDefineRuleArrayOutput
}

type ClientUserDefineRuleArray []ClientUserDefineRuleInput

func (ClientUserDefineRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClientUserDefineRule)(nil)).Elem()
}

func (i ClientUserDefineRuleArray) ToClientUserDefineRuleArrayOutput() ClientUserDefineRuleArrayOutput {
	return i.ToClientUserDefineRuleArrayOutputWithContext(context.Background())
}

func (i ClientUserDefineRuleArray) ToClientUserDefineRuleArrayOutputWithContext(ctx context.Context) ClientUserDefineRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientUserDefineRuleArrayOutput)
}

// ClientUserDefineRuleMapInput is an input type that accepts ClientUserDefineRuleMap and ClientUserDefineRuleMapOutput values.
// You can construct a concrete instance of `ClientUserDefineRuleMapInput` via:
//
//	ClientUserDefineRuleMap{ "key": ClientUserDefineRuleArgs{...} }
type ClientUserDefineRuleMapInput interface {
	pulumi.Input

	ToClientUserDefineRuleMapOutput() ClientUserDefineRuleMapOutput
	ToClientUserDefineRuleMapOutputWithContext(context.Context) ClientUserDefineRuleMapOutput
}

type ClientUserDefineRuleMap map[string]ClientUserDefineRuleInput

func (ClientUserDefineRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClientUserDefineRule)(nil)).Elem()
}

func (i ClientUserDefineRuleMap) ToClientUserDefineRuleMapOutput() ClientUserDefineRuleMapOutput {
	return i.ToClientUserDefineRuleMapOutputWithContext(context.Background())
}

func (i ClientUserDefineRuleMap) ToClientUserDefineRuleMapOutputWithContext(ctx context.Context) ClientUserDefineRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientUserDefineRuleMapOutput)
}

type ClientUserDefineRuleOutput struct{ *pulumi.OutputState }

func (ClientUserDefineRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClientUserDefineRule)(nil)).Elem()
}

func (o ClientUserDefineRuleOutput) ToClientUserDefineRuleOutput() ClientUserDefineRuleOutput {
	return o
}

func (o ClientUserDefineRuleOutput) ToClientUserDefineRuleOutputWithContext(ctx context.Context) ClientUserDefineRuleOutput {
	return o
}

// The operation type. Value:
// - **0**: plus White
// - **1**: Plus Black.
func (o ClientUserDefineRuleOutput) ActionType() pulumi.IntOutput {
	return o.ApplyT(func(v *ClientUserDefineRule) pulumi.IntOutput { return v.ActionType }).(pulumi.IntOutput)
}

// The custom rule name.
func (o ClientUserDefineRuleOutput) ClientUserDefineRuleName() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientUserDefineRule) pulumi.StringOutput { return v.ClientUserDefineRuleName }).(pulumi.StringOutput)
}

// Command line. When the value of the Type attribute is 2, 3, 4, 5, 6, or 7, the command line field is required.
func (o ClientUserDefineRuleOutput) Cmdline() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClientUserDefineRule) pulumi.StringPtrOutput { return v.Cmdline }).(pulumi.StringPtrOutput)
}

// The creation time of the resource.
func (o ClientUserDefineRuleOutput) CreateTime() pulumi.IntOutput {
	return o.ApplyT(func(v *ClientUserDefineRule) pulumi.IntOutput { return v.CreateTime }).(pulumi.IntOutput)
}

// The file path. When the value of the Type attribute is 4 or 6, 7, the FilePath field is required.
func (o ClientUserDefineRuleOutput) FilePath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClientUserDefineRule) pulumi.StringPtrOutput { return v.FilePath }).(pulumi.StringPtrOutput)
}

// Process hash list. When the value of the Type attribute is 1, the Hash attribute is required.
func (o ClientUserDefineRuleOutput) Hash() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClientUserDefineRule) pulumi.StringPtrOutput { return v.Hash }).(pulumi.StringPtrOutput)
}

// IP address. When the value of the Type attribute is 3, the Ip attribute is required.
func (o ClientUserDefineRuleOutput) Ip() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClientUserDefineRule) pulumi.StringPtrOutput { return v.Ip }).(pulumi.StringPtrOutput)
}

// The new file path to rename the file. When the value of the Type attribute is 7, the NewFilePath attribute is required.
func (o ClientUserDefineRuleOutput) NewFilePath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClientUserDefineRule) pulumi.StringPtrOutput { return v.NewFilePath }).(pulumi.StringPtrOutput)
}

// The parent command line.
func (o ClientUserDefineRuleOutput) ParentCmdline() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClientUserDefineRule) pulumi.StringPtrOutput { return v.ParentCmdline }).(pulumi.StringPtrOutput)
}

// Parent process path.
func (o ClientUserDefineRuleOutput) ParentProcPath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClientUserDefineRule) pulumi.StringPtrOutput { return v.ParentProcPath }).(pulumi.StringPtrOutput)
}

// The operating system type. Value:
// - **windows**:widows
// - **linux**:linux
// - **all**: all.
func (o ClientUserDefineRuleOutput) Platform() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientUserDefineRule) pulumi.StringOutput { return v.Platform }).(pulumi.StringOutput)
}

// The port number. When the value of the Type attribute is 3, the PortStr attribute is required. Value range: **1-65535**.
func (o ClientUserDefineRuleOutput) PortStr() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientUserDefineRule) pulumi.StringOutput { return v.PortStr }).(pulumi.StringOutput)
}

// The process path. When the Type attribute is set to 2, 3, 4, 5, 6, or 7, the ProcPath attribute is required.
func (o ClientUserDefineRuleOutput) ProcPath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClientUserDefineRule) pulumi.StringPtrOutput { return v.ProcPath }).(pulumi.StringPtrOutput)
}

// The registry value. When the value of the Type attribute is 5, the RegistryKey attribute is required.
func (o ClientUserDefineRuleOutput) RegistryContent() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClientUserDefineRule) pulumi.StringPtrOutput { return v.RegistryContent }).(pulumi.StringPtrOutput)
}

// The registry key. When the value of the Type attribute is 5, the RegistryKey attribute is required.
func (o ClientUserDefineRuleOutput) RegistryKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClientUserDefineRule) pulumi.StringPtrOutput { return v.RegistryKey }).(pulumi.StringPtrOutput)
}

// The rule type. Value:
// - **1**: Process hash
// - **2**: command line
// - **3**: Process network
// - **4**: File reading and writing
// - **5**: Operate the registry
// - **6**: Load Dynamic Link Library
// - **7**: File Rename.
func (o ClientUserDefineRuleOutput) Type() pulumi.IntOutput {
	return o.ApplyT(func(v *ClientUserDefineRule) pulumi.IntOutput { return v.Type }).(pulumi.IntOutput)
}

type ClientUserDefineRuleArrayOutput struct{ *pulumi.OutputState }

func (ClientUserDefineRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClientUserDefineRule)(nil)).Elem()
}

func (o ClientUserDefineRuleArrayOutput) ToClientUserDefineRuleArrayOutput() ClientUserDefineRuleArrayOutput {
	return o
}

func (o ClientUserDefineRuleArrayOutput) ToClientUserDefineRuleArrayOutputWithContext(ctx context.Context) ClientUserDefineRuleArrayOutput {
	return o
}

func (o ClientUserDefineRuleArrayOutput) Index(i pulumi.IntInput) ClientUserDefineRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClientUserDefineRule {
		return vs[0].([]*ClientUserDefineRule)[vs[1].(int)]
	}).(ClientUserDefineRuleOutput)
}

type ClientUserDefineRuleMapOutput struct{ *pulumi.OutputState }

func (ClientUserDefineRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClientUserDefineRule)(nil)).Elem()
}

func (o ClientUserDefineRuleMapOutput) ToClientUserDefineRuleMapOutput() ClientUserDefineRuleMapOutput {
	return o
}

func (o ClientUserDefineRuleMapOutput) ToClientUserDefineRuleMapOutputWithContext(ctx context.Context) ClientUserDefineRuleMapOutput {
	return o
}

func (o ClientUserDefineRuleMapOutput) MapIndex(k pulumi.StringInput) ClientUserDefineRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClientUserDefineRule {
		return vs[0].(map[string]*ClientUserDefineRule)[vs[1].(string)]
	}).(ClientUserDefineRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClientUserDefineRuleInput)(nil)).Elem(), &ClientUserDefineRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClientUserDefineRuleArrayInput)(nil)).Elem(), ClientUserDefineRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClientUserDefineRuleMapInput)(nil)).Elem(), ClientUserDefineRuleMap{})
	pulumi.RegisterOutputType(ClientUserDefineRuleOutput{})
	pulumi.RegisterOutputType(ClientUserDefineRuleArrayOutput{})
	pulumi.RegisterOutputType(ClientUserDefineRuleMapOutput{})
}
