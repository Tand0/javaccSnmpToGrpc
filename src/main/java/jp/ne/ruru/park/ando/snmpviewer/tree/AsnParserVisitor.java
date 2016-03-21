package jp.ne.ruru.park.ando.snmpviewer.tree;


/* Generated By:JavaCC: Do not edit this line. AsnParserVisitor.java Version 6.1_2 */
public interface AsnParserVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTInput node, Object data);
  public Object visit(ASTModuleDefinition node, Object data);
  public Object visit(ASTTagDefault node, Object data);
  public Object visit(ASTModuleIdentifier node, Object data);
  public Object visit(ASTAssignedIdentifier node, Object data);
  public Object visit(ASTModuleBody node, Object data);
  public Object visit(ASTExports node, Object data);
  public Object visit(ASTSymbolsExported node, Object data);
  public Object visit(ASTExportSymbolList node, Object data);
  public Object visit(ASTImports node, Object data);
  public Object visit(ASTSymbolsImported node, Object data);
  public Object visit(ASTSymbolsFromModuleList node, Object data);
  public Object visit(ASTSymbolsFromModule node, Object data);
  public Object visit(ASTSymbolList node, Object data);
  public Object visit(ASTSymbol node, Object data);
  public Object visit(ASTAssignmentList node, Object data);
  public Object visit(ASTAssignment node, Object data);
  public Object visit(ASTMacroDefinition node, Object data);
  public Object visit(ASTMacroBody node, Object data);
  public Object visit(ASTMacroReference node, Object data);
  public Object visit(ASTTypeAssignment node, Object data);
  public Object visit(ASTType node, Object data);
  public Object visit(ASTGlobalType node, Object data);
  public Object visit(ASTDefinedMacroName node, Object data);
  public Object visit(ASTDefinedType node, Object data);
  public Object visit(ASTBuiltinType node, Object data);
  public Object visit(ASTOctetStringType node, Object data);
  public Object visit(ASTObjectIdentiferType node, Object data);
  public Object visit(ASTRealType node, Object data);
  public Object visit(ASTBooleanType node, Object data);
  public Object visit(ASTNullType node, Object data);
  public Object visit(ASTExternalType node, Object data);
  public Object visit(ASTEnumeratedType node, Object data);
  public Object visit(ASTIntegerType node, Object data);
  public Object visit(ASTBitStringType node, Object data);
  public Object visit(ASTSetOrSequenceOfType node, Object data);
  public Object visit(ASTChoiceType node, Object data);
  public Object visit(ASTSetOrSequenceType node, Object data);
  public Object visit(ASTSelectionType node, Object data);
  public Object visit(ASTTaggedType node, Object data);
  public Object visit(ASTTag node, Object data);
  public Object visit(ASTAnyType node, Object data);
  public Object visit(ASTNamedNumberList node, Object data);
  public Object visit(ASTNamedNumber node, Object data);
  public Object visit(ASTSignedNumber node, Object data);
  public Object visit(ASTElementTypeList node, Object data);
  public Object visit(ASTElementType node, Object data);
  public Object visit(ASTComponentsType node, Object data);
  public Object visit(ASTNamedType node, Object data);
  public Object visit(ASTClassNumber node, Object data);
  public Object visit(ASTClass node, Object data);
  public Object visit(ASTSubtypeSpec node, Object data);
  public Object visit(ASTSubtypeValueSetList node, Object data);
  public Object visit(ASTSubtypeValueSet node, Object data);
  public Object visit(ASTContainedSubtype node, Object data);
  public Object visit(ASTSingleValue node, Object data);
  public Object visit(ASTValueRange node, Object data);
  public Object visit(ASTSizeConstraint node, Object data);
  public Object visit(ASTPermittedAlphabet node, Object data);
  public Object visit(ASTInnerTypeConstraints node, Object data);
  public Object visit(ASTSingleTypeConstraint node, Object data);
  public Object visit(ASTMultipleTypeConstraints node, Object data);
  public Object visit(ASTTypeConstraints node, Object data);
  public Object visit(ASTNamedConstraint node, Object data);
  public Object visit(ASTConstraint node, Object data);
  public Object visit(ASTValueConstraint node, Object data);
  public Object visit(ASTPresenceConstraint node, Object data);
  public Object visit(ASTValueAssignment node, Object data);
  public Object visit(ASTValue node, Object data);
  public Object visit(ASTDefinedValue node, Object data);
  public Object visit(ASTBuiltinValue node, Object data);
  public Object visit(ASTCompoundValue node, Object data);
  public Object visit(ASTskip_to_matching_brace node, Object data);
  public Object visit(ASTBooleanValue node, Object data);
  public Object visit(ASTSpecialRealValue node, Object data);
  public Object visit(ASTNullValue node, Object data);
  public Object visit(ASTNamedValue node, Object data);
  public Object visit(ASTObjectIdentifierValue node, Object data);
  public Object visit(ASTObjIdComponentList node, Object data);
  public Object visit(ASTObjIdComponent node, Object data);
  public Object visit(ASTNumberForm node, Object data);
  public Object visit(ASTNameAndNumberForm node, Object data);
  public Object visit(ASTBinaryString node, Object data);
  public Object visit(ASTHexString node, Object data);
  public Object visit(ASTCharString node, Object data);
  public Object visit(ASTnumber node, Object data);
  public Object visit(ASTidentifier node, Object data);
  public Object visit(ASTmodulereference node, Object data);
  public Object visit(ASTtypereference node, Object data);
  public Object visit(ASTTextualConventionMacroType node, Object data);
  public Object visit(ASTModuleIdentityMacroType node, Object data);
  public Object visit(ASTNotificationTypeMacroType node, Object data);
  public Object visit(ASTNotificationGroupMacroType node, Object data);
  public Object visit(ASTModuleComplianceMacroType node, Object data);
  public Object visit(ASTObjecGroupMacroType node, Object data);
  public Object visit(ASTObjecIdentityMacroType node, Object data);
  public Object visit(ASTTrapTypeMacroType node, Object data);
  public Object visit(ASTAgentCapabilitiesMacroType node, Object data);
  public Object visit(ASTObjectTypeMacroType node, Object data);
  public Object visit(ASTSnmpDisplayHintPart node, Object data);
  public Object visit(ASTSnmpObjectsPart node, Object data);
  public Object visit(ASTSnmpNitificationsPart node, Object data);
  public Object visit(ASTSnmpStatus node, Object data);
  public Object visit(ASTSnmpAccess node, Object data);
  public Object visit(ASTSnmpDescrPart node, Object data);
  public Object visit(ASTSnmpReferencePart node, Object data);
  public Object visit(ASTSnmpIndexPart node, Object data);
  public Object visit(ASTSnmpExtendsPart node, Object data);
  public Object visit(ASTSnmpUniquenessPart node, Object data);
  public Object visit(ASTTypeOrValueList node, Object data);
  public Object visit(ASTTypeOrValue node, Object data);
  public Object visit(ASTSnmpDefValPart node, Object data);
  public Object visit(ASTSnmpDefValSubPart node, Object data);
  public Object visit(ASTSnmpDefValSubSubPart node, Object data);
  public Object visit(ASTSnmpDefValSubSubSubPart node, Object data);
  public Object visit(ASTSnmpAugmentsPart node, Object data);
  public Object visit(ASTSnmpInstallErrorsPart node, Object data);
  public Object visit(ASTSnmpSubjectCategoriesPart node, Object data);
  public Object visit(ASTSnmpLastUpdatedPart node, Object data);
  public Object visit(ASTSnmpOrganizationPart node, Object data);
  public Object visit(ASTSnmpContactInfoPart node, Object data);
  public Object visit(ASTSnmpRevisionPart node, Object data);
  public Object visit(ASTSnmpReferencesPart node, Object data);
  public Object visit(ASTSnmpSyntaxPart node, Object data);
  public Object visit(ASTSnmpWriteSyntaxPart node, Object data);
  public Object visit(ASTSnmpEnterprisePart node, Object data);
  public Object visit(ASTSnmpVariablesPart node, Object data);
  public Object visit(ASTSnmpUnitsPart node, Object data);
  public Object visit(ASTSnmpTagPart node, Object data);
  public Object visit(ASTSnmpMandatoryGroupsPart node, Object data);
  public Object visit(ASTSnmpGroupPart node, Object data);
  public Object visit(ASTSnmpObjectPart node, Object data);
  public Object visit(ASTSnmpProductReleasePart node, Object data);
  public Object visit(ASTSnmpSupportsPart node, Object data);
  public Object visit(ASTSnmpIncludesPart node, Object data);
  public Object visit(ASTSnmpValiationPart node, Object data);
}
/* JavaCC - OriginalChecksum=6698c4b29cc4624031d7c83e9a2fa753 (do not edit this line) */